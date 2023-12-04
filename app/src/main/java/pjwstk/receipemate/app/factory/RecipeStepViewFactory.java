package pjwstk.receipemate.app.factory;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.RecipeIngredient;
import pjwstk.receipemate.app.entity.RecipeStep;
import pjwstk.receipemate.app.view.IngredientView;
import pjwstk.receipemate.app.view.RecipeStepView;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeStepViewFactory {
    public RecipeStepView make(RecipeStep recipeStep) {
        if (recipeStep == null) return null;

        return new RecipeStepView(
                recipeStep.getId(),
                recipeStep.getStepOrder(),
                recipeStep.getTitle(),
                recipeStep.getDescription()
        );
    }

    public List<RecipeStepView> makeList(List<RecipeStep> recipeSteps) {
        return recipeSteps.stream()
                .map(this::make)
                .collect(Collectors.toList());
    }
}
