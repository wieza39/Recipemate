package pjwstk.receipemate.app.viewfactory.recipe.ingredient;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.event.annotation.BeforeTestMethod;
import pjwstk.receipemate.app.entity.Ingredient;
import pjwstk.receipemate.app.entity.Measure;
import pjwstk.receipemate.app.entity.Recipe;
import pjwstk.receipemate.app.entity.RecipeIngredient;
import pjwstk.receipemate.app.view.recipe.ingredient.RecipeIngredientView;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class RecipeIngredientViewFactoryTest {
    @InjectMocks
    RecipeIngredientViewFactory recipeIngredientViewFactory;

    @Test
    void shouldMakeMethodReturnNull() {
        // when
        RecipeIngredientView recipeIngredientView = this.recipeIngredientViewFactory.make(null);

        // then
        assertThat(recipeIngredientView).isNull();
    }

    @Test
    void shouldMakeMethodReturnRecipeIngredientView() {
        // given
        RecipeIngredient recipeIngredient = initRecipeIngredient();

        // when
        RecipeIngredientView expectedIngredientView = this.recipeIngredientViewFactory.make(recipeIngredient);

        // then
        assertThat(expectedIngredientView).isInstanceOf(RecipeIngredientView.class);
        assertThat(expectedIngredientView.getMeasure()).isEqualTo(recipeIngredient.getMeasure().getName());
        assertThat(expectedIngredientView.getName()).isEqualTo(recipeIngredient.getIngredient().getName());
    }

    @Test
    void shouldMakeListMethodReturnNull() {
        // when
        List<RecipeIngredientView> recipeIngredientViews = this.recipeIngredientViewFactory.makeList(null);

        // then
        assertThat(recipeIngredientViews).isNull();
    }

    @Test
    void shouldMakeListMethodReturnRecipeIngredientView() {
        // given
        RecipeIngredient recipeIngredient = initRecipeIngredient();
        List<RecipeIngredient> recipeIngredients = List.of(recipeIngredient);

        // when
        List<RecipeIngredientView> expectedIngredientViews = this.recipeIngredientViewFactory.makeList(recipeIngredients);

        // then
        assertThat(expectedIngredientViews).isInstanceOf(List.class);
        assertThat(expectedIngredientViews.size()).isEqualTo(1);
        assertThat(expectedIngredientViews.get(0)).isInstanceOf(RecipeIngredientView.class);
    }

    private RecipeIngredient initRecipeIngredient() {
        Recipe recipe = new Recipe();
        recipe.setId(1);
        recipe.setName("Test Recipe");

        Ingredient ingredient = new Ingredient();
        ingredient.setId(1);
        ingredient.setName("Test Ingredient");

        Measure measure = new Measure();
        measure.setId(1);
        measure.setName("Test Measure");

        RecipeIngredient recipeIngredient = new RecipeIngredient();
        recipeIngredient.setId(1);
        recipeIngredient.setRecipe(recipe);
        recipeIngredient.setIngredient(ingredient);
        recipeIngredient.setMeasure(measure);

        return recipeIngredient;
    }
}