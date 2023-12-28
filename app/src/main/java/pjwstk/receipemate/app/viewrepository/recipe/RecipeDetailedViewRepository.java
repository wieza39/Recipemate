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

import java.util.Optional;

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
        Optional<AverageRateRecipe> recipe = this.averageRateRecipeRepository.findById(id);

        if (recipe.isEmpty()) {
            throw new NotFoundException("Recipe not found!");
        }

        Page<AverageRateRecipe> relatedRecipes = this.averageRateRecipeRepository.getRelated(recipe.get().getRecipe(), pageable);

        return this.recipeDetailedViewFactory.make(
                recipe.get(),
                this.recipeViewFactory.makeList(relatedRecipes.getContent())
        );
    }

}
