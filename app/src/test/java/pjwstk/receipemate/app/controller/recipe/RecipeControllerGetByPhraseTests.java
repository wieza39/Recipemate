package pjwstk.receipemate.app.controller.recipe;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import pjwstk.receipemate.app.entity.Category;
import pjwstk.receipemate.app.entity.Recipe;
import pjwstk.receipemate.app.enums.RecipeDifficulty;
import pjwstk.receipemate.app.exception.NotFoundException;
import pjwstk.receipemate.app.repository.CategoryRepository;
import pjwstk.receipemate.app.repository.recipe.RecipeRepository;
import pjwstk.receipemate.app.view.PageView;
import pjwstk.receipemate.app.view.category.CategoryView;
import pjwstk.receipemate.app.view.recipe.RecipeDetailedView;
import pjwstk.receipemate.app.view.recipe.RecipeView;

import java.time.LocalDateTime;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
class RecipeControllerGetByPhraseTests {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private RecipeRepository recipeRepository;

    @Test
    @Transactional
    void shouldGetRecipesByPhrase() throws Exception {
        // given
        String phrase = "Spaghetti";

        Category category = new Category();
        category.setName("Test");
        this.categoryRepository.save(category);

        Recipe recipe = new Recipe();
        recipe.setName(phrase + " test 123");
        recipe.setDescription("Test description");
        recipe.setDifficulty(RecipeDifficulty.HARD);
        recipe.setCategory(category);
        recipe.setTimeConsuming("45");
        recipe.setUpdatedAt(LocalDateTime.now());

        this.recipeRepository.save(recipe);

        // when
        MvcResult mvcResult = mockMvc.perform(get("/recipe/search?phrase=" + phrase))
                .andExpect(status().is(200))
                .andReturn();
        PageView pageView = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), PageView.class);

        // then
        assertThat(pageView).isNotNull();
        assertThat(pageView.getItems()).isNotEmpty();
        assertThat(pageView.getItems().size()).isEqualTo(1);
        assertThat(pageView.getItems().get(0)).isNotNull();

        RecipeView responseRecipeView = objectMapper.readValue(objectMapper.writeValueAsString(pageView.getItems().get(0)), RecipeView.class);
        assertThat(responseRecipeView.getId()).isEqualTo(recipe.getId());
        assertThat(responseRecipeView.getName()).isEqualTo(recipe.getName());
        assertThat(responseRecipeView.getDescription()).isEqualTo(recipe.getDescription());
        assertThat(responseRecipeView.getDifficulty()).isEqualTo(RecipeDifficulty.HARD.getType());
        assertThat(responseRecipeView.getCategory()).isInstanceOf(CategoryView.class);
    }


    @Test
    void shouldThrowNotFoundException() throws Exception {
        // given
        String phrase = "test";
        // when
        // then
        mockMvc.perform(get("/recipe/search?phrase=" + phrase).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound())
                .andExpect(result -> assertTrue(result.getResolvedException() instanceof NotFoundException))
                .andExpect(result -> assertEquals(
                        "Recipes not found!",
                        Objects.requireNonNull(result.getResolvedException()).getMessage()
                ));
    }
}