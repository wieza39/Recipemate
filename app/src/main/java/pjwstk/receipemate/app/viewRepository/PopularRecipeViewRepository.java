package pjwstk.receipemate.app.viewRepository;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.model.AverageRateRecipe;
import pjwstk.receipemate.app.repository.AverageRateRecipeRepository;
import pjwstk.receipemate.app.view.PopularRepositoryView;

import java.util.ArrayList;
import java.util.List;

@Service
public class PopularRecipeViewRepository {
    private final AverageRateRecipeRepository averageRateRecipeRepository;

    public PopularRecipeViewRepository(AverageRateRecipeRepository averageRateRecipeRepository) {
        this.averageRateRecipeRepository = averageRateRecipeRepository;
    }

    public List<PopularRepositoryView> getList(int limit) {
        List<AverageRateRecipe> averageRateRecipes = this.averageRateRecipeRepository.getAll(limit);
        List<PopularRepositoryView> popularRepositoryViews = new ArrayList<>();

        for (AverageRateRecipe averageRateRecipe : averageRateRecipes) {
            popularRepositoryViews.add(
                    new PopularRepositoryView(
                            averageRateRecipe.getRecipe().getId(),
                            averageRateRecipe.getRecipe().getName(),
                            averageRateRecipe.getRecipe().getDescription(),
                            averageRateRecipe.getRecipe().getStepsDescriptions(),
                            averageRateRecipe.getRecipe().getTimeConsuming(),
                            averageRateRecipe.getRecipe().getDifficulty(),
                            averageRateRecipe.getRecipe().getCategory(),
                            averageRateRecipe.getRecipe().getCreated_at(),
                            averageRateRecipe.getRecipe().getUpdated_at(),
                            averageRateRecipe.getAverageRate()
                    )
            );
        }

        return popularRepositoryViews;
    }
}