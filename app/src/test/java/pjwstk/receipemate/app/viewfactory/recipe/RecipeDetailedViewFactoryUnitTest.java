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
import pjwstk.receipemate.app.view.recipe.RecipeDetailedView;
import pjwstk.receipemate.app.view.recipe.RecipeView;
import pjwstk.receipemate.app.viewfactory.image.ImageViewFactory;
import pjwstk.receipemate.app.viewfactory.category.CategoryViewFactory;
import pjwstk.receipemate.app.viewfactory.recipe.ingredient.RecipeIngredientViewFactory;
import pjwstk.receipemate.app.viewfactory.recipe.step.RecipeStepViewFactory;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RecipeDetailedViewFactoryUnitTest {
    @Mock
    CategoryViewFactory categoryViewFactory;

    @Mock
    RecipeIngredientViewFactory recipeIngredientViewFactory;

    @Mock
    RecipeStepViewFactory recipeStepViewFactory;

    @Mock
    ImageViewFactory imageViewFactory;

    @InjectMocks
    RecipeDetailedViewFactory recipeDetailedViewFactory;

    @Test
    void shouldMakeMethodThrowNullPointerExceptionWhenCredentialsAreNulls() {
        // when
        // then
        assertThrows(
                NullPointerException.class,
                () -> this.recipeDetailedViewFactory.make(null, null)
        );
    }

    @Test
    void shouldMakeMethodThrowNullPointerExceptionWhenOnlyAverageRateRecipeIsNull() {
        // given
        List<RecipeView> relatedRecipes = List.of(new RecipeView());

        // then
        assertThrows(
                NullPointerException.class,
                () -> this.recipeDetailedViewFactory.make(null, relatedRecipes)
        );
    }

    @Test
    void shouldMakeMethodReturnRecipeDetailedViewWithEmptyRelatedRecipesWhenOnlyListOfRelatedRecipesIsNull() {
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
        when(recipeIngredientViewFactory.makeList(any())).thenReturn(Collections.emptyList());
        when(recipeStepViewFactory.makeList(any())).thenReturn(Collections.emptyList());
        when(imageViewFactory.makeList(any())).thenReturn(Collections.emptyList());
        when(categoryViewFactory.make(any())).thenReturn(categoryView);

        RecipeDetailedView recipeDetailedView = this.recipeDetailedViewFactory.make(averageRateRecipe, null);

        // then
        assertThat(recipeDetailedView).isInstanceOf(RecipeDetailedView.class);
        assertThat(recipeDetailedView.getRelatedRecipes()).isNull();
        assertThat(recipeDetailedView.getCategory()).isEqualTo(categoryView);
    }

    @Test
    void shouldMakeListMethodReturnRecipeDetailedViewWithEmptyRelatedPosts() {
        // given
        Recipe recipe = new Recipe();
        recipe.setId(1);
        recipe.setName("Name");
        recipe.setDifficulty(RecipeDifficulty.HARD);

        AverageRateRecipe averageRateRecipe = new AverageRateRecipe(
                recipe,
                1.0
        );

        List<RecipeView> relatedRecipes = List.of(new RecipeView());

        CategoryView categoryView = new CategoryView();

        // when
        when(recipeIngredientViewFactory.makeList(any())).thenReturn(Collections.emptyList());
        when(recipeStepViewFactory.makeList(any())).thenReturn(Collections.emptyList());
        when(imageViewFactory.makeList(any())).thenReturn(Collections.emptyList());
        when(categoryViewFactory.make(any())).thenReturn(categoryView);

        RecipeDetailedView recipeDetailedView = this.recipeDetailedViewFactory.make(averageRateRecipe, relatedRecipes);

        // then
        assertThat(recipeDetailedView).isInstanceOf(RecipeDetailedView.class);
        assertThat(recipeDetailedView.getRelatedRecipes()).isNotNull();
        assertThat(recipeDetailedView.getRelatedRecipes()).isEqualTo(relatedRecipes);
        assertThat(recipeDetailedView.getCategory()).isEqualTo(categoryView);
    }
}