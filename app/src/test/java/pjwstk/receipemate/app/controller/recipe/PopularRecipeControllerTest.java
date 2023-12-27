package pjwstk.receipemate.app.controller.recipe;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
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
import pjwstk.receipemate.app.view.recipe.RecipeView;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
class PopularRecipeControllerTest {
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
    void shouldGetOnlyOnePageElement() throws Exception {
        Category category = new Category();
        category.setName("Test Category");
        this.categoryRepository.save(category);

        // given
        Recipe recipe = new Recipe();
        recipe.setName("Test name");
        recipe.setDescription("Test description");
        recipe.setDifficulty(RecipeDifficulty.HARD);
        recipe.setCategory(category);
        recipe.setTimeConsuming("45");
        recipe.setUpdatedAt(LocalDateTime.now());

        this.recipeRepository.save(recipe);

        // when
        MvcResult mvcResult = mockMvc.perform(get("/recipe/popular"))
                .andExpect(status().is(200))
                .andReturn();
        PageView pageView = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), PageView.class);

        // then
        assertThat(pageView).isNotNull();
        assertThat(pageView).isInstanceOf(PageView.class);
        assertThat(pageView.getTotalElements()).isEqualTo(1);
        assertThat(pageView.getTotalPages()).isEqualTo(1);
        assertThat(pageView.getPageNumber()).isEqualTo(0);
        assertThat(pageView.getItems()).isNotEmpty();
        assertThat(pageView.getItems()).isInstanceOf(List.class);
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
        // when
        // then
        mockMvc.perform(get("/recipe/popular").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound())
                .andExpect(result -> assertTrue(result.getResolvedException() instanceof NotFoundException))
                .andExpect(result -> assertEquals(
                        "Recipes not found!",
                        Objects.requireNonNull(result.getResolvedException()).getMessage()
                ));
    }
}