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
import pjwstk.receipemate.app.view.category.CategoryView;
import pjwstk.receipemate.app.view.recipe.RecipeDetailedView;

import java.time.LocalDateTime;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@AutoConfigureMockMvc
@SpringBootTest
class RecipeControllerFindTests {
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
    void shouldGetSingleRecipe() throws Exception {
        // given
        Category category = new Category();
        category.setName("Test Category");
        this.categoryRepository.save(category);

        Recipe recipe = new Recipe();
        recipe.setName("Test name");
        recipe.setDescription("Test description");
        recipe.setDifficulty(RecipeDifficulty.HARD);
        recipe.setCategory(category);
        recipe.setTimeConsuming("45");
        recipe.setUpdatedAt(LocalDateTime.now());

        this.recipeRepository.save(recipe);

        // when
        MvcResult mvcResult = mockMvc.perform(get("/recipe/" + recipe.getId()))
                .andExpect(status().is(200))
                .andReturn();
        RecipeDetailedView responseRecipeDetailedView = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), RecipeDetailedView.class);

        // then
        assertThat(responseRecipeDetailedView).isNotNull();
        assertThat(responseRecipeDetailedView.getId()).isEqualTo(recipe.getId());
        assertThat(responseRecipeDetailedView.getName()).isEqualTo(recipe.getName());
        assertThat(responseRecipeDetailedView.getDifficulty()).isEqualTo(recipe.getDifficulty().getType());
        assertThat(responseRecipeDetailedView.getCategory()).isInstanceOf(CategoryView.class);
        assertThat(responseRecipeDetailedView.getCategory().getId()).isEqualTo(recipe.getCategory().getId());
    }

    @Test
    void shouldThrowNotFoundException() throws Exception {
        // given
        // when
        // then
        mockMvc.perform(get("/recipe/{id}", 0).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound())
                .andExpect(result -> assertTrue(result.getResolvedException() instanceof NotFoundException))
                .andExpect(result -> assertEquals(
                        "Recipe not found!",
                        Objects.requireNonNull(result.getResolvedException()).getMessage()
                ));
    }
}