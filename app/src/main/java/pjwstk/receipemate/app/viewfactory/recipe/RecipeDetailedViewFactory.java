package pjwstk.receipemate.app.viewfactory.recipe;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.Recipe;
import pjwstk.receipemate.app.model.AverageRateRecipe;
import pjwstk.receipemate.app.view.recipe.RecipeView;
import pjwstk.receipemate.app.viewfactory.recipe.ingredient.RecipeIngredientViewFactory;
import pjwstk.receipemate.app.viewfactory.recipe.step.RecipeStepViewFactory;

@Service
public class RecipeDetailedViewFactory {
    private final RecipeViewFactory recipeViewFactory;
    private final RecipeIngredientViewFactory recipeIngredientViewFactory;
    private final RecipeStepViewFactory recipeStepViewFactory;

    public RecipeDetailedViewFactory(
            RecipeViewFactory recipeViewFactory,
            RecipeIngredientViewFactory recipeIngredientViewFactory,
            RecipeStepViewFactory recipeStepViewFactory
    ) {
        this.recipeViewFactory = recipeViewFactory;
        this.recipeIngredientViewFactory = recipeIngredientViewFactory;
        this.recipeStepViewFactory = recipeStepViewFactory;
    }

    public RecipeView make(AverageRateRecipe averageRateRecipe) {
        Recipe recipe = averageRateRecipe.getRecipe();

        RecipeView recipeView = this.recipeViewFactory.make(averageRateRecipe);

        recipeView.setIngredients(this.recipeIngredientViewFactory.makeList(recipe.getIngredients()));
        recipeView.setSteps(this.recipeStepViewFactory.makeList(recipe.getSteps()));

        return recipeView;
    }
}
