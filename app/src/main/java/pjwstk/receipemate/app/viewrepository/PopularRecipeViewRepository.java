package pjwstk.receipemate.app.viewrepository;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.view.recipe.RecipeView;
import pjwstk.receipemate.app.viewfactory.PageViewFactory;
import pjwstk.receipemate.app.viewfactory.recipe.RecipeViewFactory;
import pjwstk.receipemate.app.model.AverageRateRecipe;
import pjwstk.receipemate.app.repository.recipe.AverageRateRecipeRepository;
import pjwstk.receipemate.app.view.PageView;

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
        List<RecipeView> popularRecipeDetailedViews = this.recipeViewFactory.makeList(averageRateRecipesPage);

        return this.pageViewFactory.make(
                averageRateRecipesPage,
                popularRecipeDetailedViews
        );
    }
}