package pjwstk.receipemate.app.viewrepository;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.Recipe;
import pjwstk.receipemate.app.exception.NotFoundException;
import pjwstk.receipemate.app.factory.RecipeViewFactory;
import pjwstk.receipemate.app.repository.RecipeRepository;
import pjwstk.receipemate.app.view.RecipeView;

import java.util.Optional;

@Service
public class RecipeViewRepository {
    private final RecipeRepository recipeRepository;
    private final RecipeViewFactory recipeViewFactory;

    public RecipeViewRepository(RecipeRepository recipeRepository, RecipeViewFactory recipeViewFactory) {
        this.recipeRepository = recipeRepository;
        this.recipeViewFactory = recipeViewFactory;
    }

    public RecipeView get(long id) {
        Optional<Recipe> recipe = this.recipeRepository.findById(id);

        if (recipe.isEmpty()) {
            throw new NotFoundException("Recipe not found!");
        }

        return this.recipeViewFactory.make(recipe.get());
    }
}
