package pjwstk.receipemate.app.viewrepository;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.exception.NotFoundException;
import pjwstk.receipemate.app.viewfactory.recipe.RecipeDetailedViewFactory;
import pjwstk.receipemate.app.model.AverageRateRecipe;
import pjwstk.receipemate.app.repository.recipe.AverageRateRecipeRepository;
import pjwstk.receipemate.app.view.recipe.RecipeView;

@Service
public class RecipeViewRepository {
    private final AverageRateRecipeRepository averageRateRecipeRepository;
    private final RecipeDetailedViewFactory recipeDetailedViewFactory;

    public RecipeViewRepository(
            AverageRateRecipeRepository averageRateRecipeRepository,
            RecipeDetailedViewFactory recipeDetailedViewFactory
    ) {
        this.averageRateRecipeRepository = averageRateRecipeRepository;
        this.recipeDetailedViewFactory = recipeDetailedViewFactory;
    }

    public RecipeView get(long id) {
        AverageRateRecipe recipe = this.averageRateRecipeRepository.findById(id);

        if (recipe == null) {
            throw new NotFoundException("Recipe not found!");
        }

        return this.recipeDetailedViewFactory.make(recipe);
    }
}
