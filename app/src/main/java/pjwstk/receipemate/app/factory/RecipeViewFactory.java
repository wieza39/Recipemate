package pjwstk.receipemate.app.factory;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.Recipe;
import pjwstk.receipemate.app.view.RecipeView;

@Service
public class RecipeViewFactory {
    private final ImageViewFactory imageViewFactory;
    private final IngredientViewFactory ingredientViewFactory;
    private final RecipeStepViewFactory recipeStepViewFactory;

    public RecipeViewFactory(
            ImageViewFactory imageViewFactory,
            IngredientViewFactory ingredientViewFactory,
            RecipeStepViewFactory recipeStepViewFactory
    ) {
        this.imageViewFactory = imageViewFactory;
        this.ingredientViewFactory = ingredientViewFactory;
        this.recipeStepViewFactory = recipeStepViewFactory;
    }

    public RecipeView make(Recipe recipe) {
        return new RecipeView(
                recipe.getId(),
                recipe.getName(),
                recipe.getDescription(),
                recipe.getTimeConsuming(),
                recipe.getDifficulty().getType(),
                recipe.getPortionCount(),
                recipe.getCategory(),
                recipe.getCreatedAt(),
                recipe.getUpdatedAt(),
                this.imageViewFactory.makeList(recipe.getImages()),
                this.ingredientViewFactory.makeList(recipe.getIngredients()),
                this.recipeStepViewFactory.makeList(recipe.getSteps())
        );
    }
}
