package pjwstk.receipemate.app.viewfactory.recipe.step;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import pjwstk.receipemate.app.entity.RecipeStep;
import pjwstk.receipemate.app.view.recipe.step.RecipeStepView;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class RecipeStepViewFactoryTest {
    @InjectMocks
    RecipeStepViewFactory recipeStepViewFactory;

    @Test
    void shouldMakeMethodReturnNull() {
        // when
        RecipeStepView recipeStepView = this.recipeStepViewFactory.make(null);

        // then
        assertThat(recipeStepView).isNull();
    }

    @Test
    void shouldMakeMethodReturnRecipeStepView() {
        // given
        RecipeStep recipeStep = new RecipeStep();
        recipeStep.setId(1);
        recipeStep.setTitle("Test Recipe Step");
        recipeStep.setDescription("Test Recipe Step Description");
        recipeStep.setStepOrder(1);

        // when
        RecipeStepView expectedRecipeStepView = this.recipeStepViewFactory.make(recipeStep);

        // then
        assertThat(expectedRecipeStepView).isInstanceOf(RecipeStepView.class);
        assertThat(expectedRecipeStepView.getId()).isEqualTo(recipeStep.getId());
        assertThat(expectedRecipeStepView.getTitle()).isEqualTo(recipeStep.getTitle());
        assertThat(expectedRecipeStepView.getDescription()).isEqualTo(recipeStep.getDescription());
        assertThat(expectedRecipeStepView.getOrder()).isEqualTo(recipeStep.getStepOrder());
    }

    @Test
    void shouldMakeListMethodReturnNullWhenNullProvide() {
        // when
        List<RecipeStepView> recipeStepViews = this.recipeStepViewFactory.makeList(null);

        // then
        assertThat(recipeStepViews).isNull();
    }

    @Test
    void shouldMakeListMethodReturnNullWhenEmptyListProvide() {
        // when
        List<RecipeStepView> recipeStepViews = this.recipeStepViewFactory.makeList(List.of());

        // then
        assertThat(recipeStepViews).isNull();
    }

    @Test
    void shouldMakeListMethodReturnRecipeStepViewList() {
        // given
        RecipeStep recipeStep = new RecipeStep();
        recipeStep.setId(1);
        recipeStep.setTitle("Test Recipe Step");
        recipeStep.setDescription("Test Recipe Step Description");
        recipeStep.setStepOrder(1);

        List<RecipeStep> recipeSteps = List.of(recipeStep);

        // when
        List<RecipeStepView> expectedRecipeStepViews = this.recipeStepViewFactory.makeList(recipeSteps);

        // then
        assertThat(expectedRecipeStepViews).isInstanceOf(List.class);
        assertThat(expectedRecipeStepViews.get(0)).isInstanceOf(RecipeStepView.class);
        assertThat(expectedRecipeStepViews.get(0).getId()).isEqualTo(recipeStep.getId());
        assertThat(expectedRecipeStepViews.get(0).getTitle()).isEqualTo(recipeStep.getTitle());
        assertThat(expectedRecipeStepViews.get(0).getDescription()).isEqualTo(recipeStep.getDescription());
        assertThat(expectedRecipeStepViews.get(0).getOrder()).isEqualTo(recipeStep.getStepOrder());
    }
}