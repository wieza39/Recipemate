package pjwstk.receipemate.app.viewfactory.recipe.step;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.RecipeStep;
import pjwstk.receipemate.app.view.recipe.step.RecipeStepView;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeStepViewFactory {
    public RecipeStepView make(RecipeStep recipeStep) {
        if (recipeStep == null) return null;

        RecipeStepView recipeStepView = new RecipeStepView();

        recipeStepView.setId(recipeStep.getId());
        recipeStepView.setOrder(recipeStep.getStepOrder());
        recipeStepView.setTitle(recipeStep.getTitle());
        recipeStepView.setDescription(recipeStep.getDescription());

        return recipeStepView;
    }

    public List<RecipeStepView> makeList(List<RecipeStep> recipeSteps) {
        return recipeSteps.stream()
                .map(this::make)
                .collect(Collectors.toList());
    }
}
