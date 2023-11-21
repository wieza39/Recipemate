package pjwstk.receipemate.app.factory;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.model.AverageRateRecipe;
import pjwstk.receipemate.app.view.AverageRateRecipeView;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AverageRateRecipeViewFactory {

    private final ImageViewFactory imageViewFactory;

    public AverageRateRecipeViewFactory(ImageViewFactory imageViewFactory) {
        this.imageViewFactory = imageViewFactory;
    }

    public AverageRateRecipeView make(AverageRateRecipe averageRateRecipe) {
        return new AverageRateRecipeView(
                averageRateRecipe.getRecipe().getId(),
                averageRateRecipe.getRecipe().getName(),
                averageRateRecipe.getRecipe().getDescription(),
                averageRateRecipe.getRecipe().getTimeConsuming(),
                averageRateRecipe.getRecipe().getDifficulty(),
                averageRateRecipe.getRecipe().getCategory(),
                averageRateRecipe.getRecipe().getCreatedAt(),
                averageRateRecipe.getRecipe().getUpdatedAt(),
                averageRateRecipe.getAverageRate(),
                imageViewFactory.make(averageRateRecipe.getImage())
        );
    }

    public List<AverageRateRecipeView> makeList(Page<AverageRateRecipe> averageRateRecipesPages) {
        return averageRateRecipesPages.getContent()
                .stream()
                .map(this::make)
                .collect(Collectors.toList());
    }
}
