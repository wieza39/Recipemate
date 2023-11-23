package pjwstk.receipemate.app.viewrepository;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.factory.PageViewFactory;
import pjwstk.receipemate.app.factory.AverageRateRecipeViewFactory;
import pjwstk.receipemate.app.model.AverageRateRecipe;
import pjwstk.receipemate.app.repository.AverageRateRecipeRepository;
import pjwstk.receipemate.app.view.PageView;

import org.springframework.data.domain.Pageable;
import pjwstk.receipemate.app.view.AverageRateRecipeView;

import java.util.List;

@Service
public class PopularRecipeViewRepository {
    private final AverageRateRecipeRepository averageRateRecipeRepository;
    private final AverageRateRecipeViewFactory averageRateRecipeViewFactory;
    private final PageViewFactory pageViewFactory;

    public PopularRecipeViewRepository(
            AverageRateRecipeRepository averageRateRecipeRepository,
            AverageRateRecipeViewFactory averageRateRecipeViewFactory,
            PageViewFactory pageViewFactory
    ) {
        this.averageRateRecipeRepository = averageRateRecipeRepository;
        this.averageRateRecipeViewFactory = averageRateRecipeViewFactory;
        this.pageViewFactory = pageViewFactory;
    }

    public PageView getList(Pageable pageable) {
        Page<AverageRateRecipe> averageRateRecipesPage = this.averageRateRecipeRepository.getPopular(pageable);
        List<AverageRateRecipeView> popularRecipeViews = this.averageRateRecipeViewFactory.makeList(averageRateRecipesPage);

        return this.pageViewFactory.make(
                averageRateRecipesPage,
                popularRecipeViews
        );
    }
}