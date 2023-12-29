package pjwstk.receipemate.app.viewrepository.recipe;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.exception.NotFoundException;
import pjwstk.receipemate.app.view.recipe.RecipeView;
import pjwstk.receipemate.app.viewfactory.page.PageViewFactory;
import pjwstk.receipemate.app.viewfactory.recipe.RecipeViewFactory;
import pjwstk.receipemate.app.model.AverageRateRecipe;
import pjwstk.receipemate.app.repository.recipe.AverageRateRecipeRepository;
import pjwstk.receipemate.app.view.page.PageView;

import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
public class PopularRecipeViewRepository {
    private final AverageRateRecipeRepository averageRateRecipeRepository;
    private final RecipeViewFactory recipeViewFactory;
    private final PageViewFactory pageViewFactory;

    public PopularRecipeViewRepository(
            AverageRateRecipeRepository averageRateRecipeRepository,
            RecipeViewFactory recipeViewFactory,
            PageViewFactory pageViewFactory
    ) {
        this.averageRateRecipeRepository = averageRateRecipeRepository;
        this.recipeViewFactory = recipeViewFactory;
        this.pageViewFactory = pageViewFactory;
    }

    public PageView getList(Pageable pageable) {
        Page<AverageRateRecipe> averageRateRecipesPage = this.averageRateRecipeRepository.getPopular(pageable);

        if (averageRateRecipesPage.getContent().isEmpty()) {
            throw new NotFoundException("Recipes not found!");
        }

        List<RecipeView> popularRecipeViews = this.recipeViewFactory.makeList(averageRateRecipesPage.getContent());

        return this.pageViewFactory.make(
                averageRateRecipesPage,
                popularRecipeViews
        );
    }
}