package pjwstk.receipemate.app.viewrepository.recipe;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.exception.NotFoundException;
import pjwstk.receipemate.app.view.page.PageView;
import pjwstk.receipemate.app.view.recipe.RecipeView;
import pjwstk.receipemate.app.viewfactory.page.PageViewFactory;
import pjwstk.receipemate.app.model.AverageRateRecipe;
import pjwstk.receipemate.app.repository.recipe.AverageRateRecipeRepository;
import pjwstk.receipemate.app.viewfactory.recipe.RecipeViewFactory;

import java.util.List;

@Service
public class RecipeViewRepository {
    private final AverageRateRecipeRepository averageRateRecipeRepository;
    private final RecipeViewFactory recipeViewFactory;
    private final PageViewFactory pageViewFactory;

    public RecipeViewRepository(
            AverageRateRecipeRepository averageRateRecipeRepository,
            PageViewFactory pageViewFactory,
            RecipeViewFactory recipeViewFactory
    ) {
        this.averageRateRecipeRepository = averageRateRecipeRepository;
        this.pageViewFactory = pageViewFactory;
        this.recipeViewFactory = recipeViewFactory;
    }

    public PageView getByPhrase(String phrase, Pageable pageable) {
        Page<AverageRateRecipe> averageRateRecipesPage = this.averageRateRecipeRepository.getByPhrase(phrase, pageable);

        if (averageRateRecipesPage.getContent().isEmpty()) {
            throw new NotFoundException("Recipes not found!");
        }

        List<RecipeView> recipeViews = this.recipeViewFactory.makeList(averageRateRecipesPage.getContent());

        return this.pageViewFactory.make(
                averageRateRecipesPage,
                recipeViews
        );
    }
}
