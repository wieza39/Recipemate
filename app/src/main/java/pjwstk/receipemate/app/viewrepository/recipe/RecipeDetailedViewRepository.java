package pjwstk.receipemate.app.viewrepository.recipe;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.exception.NotFoundException;
import pjwstk.receipemate.app.model.AverageRateRecipe;
import pjwstk.receipemate.app.repository.recipe.AverageRateRecipeRepository;
import pjwstk.receipemate.app.view.recipe.RecipeDetailedView;
import pjwstk.receipemate.app.viewfactory.recipe.RecipeDetailedViewFactory;
import pjwstk.receipemate.app.viewfactory.recipe.RecipeViewFactory;

@Service
public class RecipeDetailedViewRepository {
    private final AverageRateRecipeRepository averageRateRecipeRepository;
    private final RecipeDetailedViewFactory recipeDetailedViewFactory;
    private final RecipeViewFactory recipeViewFactory;

    public RecipeDetailedViewRepository(
            AverageRateRecipeRepository averageRateRecipeRepository,
            RecipeDetailedViewFactory recipeDetailedViewFactory,
            RecipeViewFactory recipeViewFactory
    ) {
        this.averageRateRecipeRepository = averageRateRecipeRepository;
        this.recipeDetailedViewFactory = recipeDetailedViewFactory;
        this.recipeViewFactory = recipeViewFactory;
    }

    public RecipeDetailedView find(long id, Pageable pageable) {
        AverageRateRecipe recipe = this.averageRateRecipeRepository.findById(id);

        if (recipe == null) {
            throw new NotFoundException("Recipe not found!");
        }

        Page<AverageRateRecipe> relatedRecipes = this.averageRateRecipeRepository.getRelated(recipe.getRecipe(), pageable);

        return this.recipeDetailedViewFactory.make(
                recipe,
                this.recipeViewFactory.makeList(relatedRecipes)
        );
    }

}
