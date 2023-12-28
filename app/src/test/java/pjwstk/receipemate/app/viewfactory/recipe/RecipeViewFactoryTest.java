package pjwstk.receipemate.app.viewfactory.recipe;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pjwstk.receipemate.app.entity.Recipe;
import pjwstk.receipemate.app.enums.RecipeDifficulty;
import pjwstk.receipemate.app.model.AverageRateRecipe;
import pjwstk.receipemate.app.view.category.CategoryView;
import pjwstk.receipemate.app.view.recipe.RecipeView;
import pjwstk.receipemate.app.viewfactory.ImageViewFactory;
import pjwstk.receipemate.app.viewfactory.category.CategoryViewFactory;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RecipeViewFactoryTest {
    @Mock
    ImageViewFactory imageViewFactory;
    @Mock
    CategoryViewFactory categoryViewFactory;
    @InjectMocks
    RecipeViewFactory recipeViewFactory;

    @Test
    void shouldMakeReturnNullWhenAverageRateRecipeIsNull() {
        // given
        RecipeView recipeView = this.recipeViewFactory.make(null);

        // then
        assertNull(recipeView);
    }

    @Test
    void shouldMakeReturnNullWhenRecipeIsNull() {
        // given
        AverageRateRecipe averageRateRecipe = new AverageRateRecipe(null, 4.5);

        // when
        RecipeView recipeView = this.recipeViewFactory.make(averageRateRecipe);

        // then
        assertNull(recipeView);
    }

    @Test
    void shouldMakeReturnRecipeView() {
        // given
        Recipe recipe = new Recipe();
        recipe.setId(1);
        recipe.setName("Name");
        recipe.setDifficulty(RecipeDifficulty.HARD);

        AverageRateRecipe averageRateRecipe = new AverageRateRecipe(
                recipe,
                1.0
        );

        CategoryView categoryView = new CategoryView();

        // when
        when(this.imageViewFactory.makeList(any())).thenReturn(Collections.emptyList());
        when(this.categoryViewFactory.make(any())).thenReturn(categoryView);

        RecipeView recipeView = this.recipeViewFactory.make(averageRateRecipe);

        // then
        assertThat(recipeView.getId()).isEqualTo(recipe.getId());
        assertThat(recipeView.getName()).isEqualTo(recipe.getName());
        assertThat(recipeView.getDifficulty()).isEqualTo(recipe.getDifficulty().getType());
    }

    @Test
    void shouldMakeListReturnNullWhenAverageRateRecipeListIsNull() {
        // given
        List<RecipeView> recipeViews = this.recipeViewFactory.makeList(null);

        // then
        assertNull(recipeViews);
    }

    @Test
    void shouldMakeListReturnNullWhenAverageRateRecipesIsEmptyList() {
        // when
        List<RecipeView> recipeViews = this.recipeViewFactory.makeList(List.of());

        // then
        assertNull(recipeViews);
    }

    @Test
    void shouldMakeListReturnRecipeViews() {
        // given
        Recipe recipe = new Recipe();
        recipe.setId(1);
        recipe.setName("Name");
        recipe.setDifficulty(RecipeDifficulty.HARD);

        List<AverageRateRecipe> averageRateRecipes = List.of(
                new AverageRateRecipe(
                        recipe,
                        1.0
                )
        );

        CategoryView categoryView = new CategoryView();

        // when
        when(this.imageViewFactory.makeList(any())).thenReturn(Collections.emptyList());
        when(this.categoryViewFactory.make(any())).thenReturn(categoryView);

        List<RecipeView> recipeViews = this.recipeViewFactory.makeList(averageRateRecipes);

        // then
        assertThat(recipeViews).isInstanceOf(List.class);
        assertThat(recipeViews.get(0).getId()).isEqualTo(recipe.getId());
        assertThat(recipeViews.get(0).getName()).isEqualTo(recipe.getName());
        assertThat(recipeViews.get(0).getDifficulty()).isEqualTo(recipe.getDifficulty().getType());
    }
}