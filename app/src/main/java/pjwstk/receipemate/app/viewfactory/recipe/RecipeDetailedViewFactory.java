package pjwstk.receipemate.app.viewfactory.recipe;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.Recipe;
import pjwstk.receipemate.app.model.AverageRateRecipe;
import pjwstk.receipemate.app.view.recipe.RecipeDetailedView;
import pjwstk.receipemate.app.view.recipe.RecipeView;
import pjwstk.receipemate.app.viewfactory.ImageViewFactory;
import pjwstk.receipemate.app.viewfactory.category.CategoryViewFactory;
import pjwstk.receipemate.app.viewfactory.recipe.ingredient.RecipeIngredientViewFactory;
import pjwstk.receipemate.app.viewfactory.recipe.step.RecipeStepViewFactory;

import java.util.List;

@Service
public class RecipeDetailedViewFactory {
    private final RecipeIngredientViewFactory recipeIngredientViewFactory;
    private final RecipeStepViewFactory recipeStepViewFactory;
    private final ImageViewFactory imageViewFactory;

    private final CategoryViewFactory categoryViewFactory;

    public RecipeDetailedViewFactory(
            RecipeIngredientViewFactory recipeIngredientViewFactory,
            RecipeStepViewFactory recipeStepViewFactory,
            ImageViewFactory imageViewFactory,
            CategoryViewFactory categoryViewFactory
    ) {
        this.recipeIngredientViewFactory = recipeIngredientViewFactory;
        this.recipeStepViewFactory = recipeStepViewFactory;
        this.imageViewFactory = imageViewFactory;
        this.categoryViewFactory = categoryViewFactory;
    }

    public RecipeDetailedView make(AverageRateRecipe averageRateRecipe, List<RecipeView> relatedRecipes) {
        if (averageRateRecipe == null) return null;

        Recipe recipe = averageRateRecipe.getRecipe();

        RecipeDetailedView recipeDetailedView = new RecipeDetailedView();

        recipeDetailedView.setId(recipe.getId());
        recipeDetailedView.setName(recipe.getName());
        recipeDetailedView.setDescription(recipe.getDescription());
        recipeDetailedView.setTimeConsuming(recipe.getTimeConsuming());
        recipeDetailedView.setDifficulty(recipe.getDifficulty().getType());
        recipeDetailedView.setCategory(this.categoryViewFactory.make(recipe.getCategory()));
        recipeDetailedView.setRating(averageRateRecipe.getAverageRate());
        recipeDetailedView.setPortionCount(recipe.getPortionCount());
        recipeDetailedView.setCreatedAt(recipe.getCreatedAt());
        recipeDetailedView.setUpdatedAt(recipe.getUpdatedAt());
        recipeDetailedView.setImages(this.imageViewFactory.makeList(recipe.getImages()));
        recipeDetailedView.setIngredients(this.recipeIngredientViewFactory.makeList(recipe.getIngredients()));
        recipeDetailedView.setSteps(this.recipeStepViewFactory.makeList(recipe.getSteps()));
        recipeDetailedView.setRelatedRecipes(relatedRecipes);

        return recipeDetailedView;
    }
}
