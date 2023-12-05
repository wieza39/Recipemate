package pjwstk.receipemate.app.viewfactory.recipe;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.Recipe;
import pjwstk.receipemate.app.model.AverageRateRecipe;
import pjwstk.receipemate.app.view.recipe.RecipeView;
import pjwstk.receipemate.app.viewfactory.ImageViewFactory;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeViewFactory {
    private final ImageViewFactory imageViewFactory;

    public RecipeViewFactory(
            ImageViewFactory imageViewFactory
    ) {
        this.imageViewFactory = imageViewFactory;
    }

    public RecipeView make(AverageRateRecipe averageRateRecipe) {
        Recipe recipe = averageRateRecipe.getRecipe();

        RecipeView recipeView = new RecipeView();

        recipeView.setId(recipe.getId());
        recipeView.setName(recipe.getName());
        recipeView.setDescription(recipe.getDescription());
        recipeView.setTimeConsuming(recipe.getTimeConsuming());
        recipeView.setDifficulty(recipe.getDifficulty().getType());
        recipeView.setCategory(recipe.getCategory());
        recipeView.setRating(averageRateRecipe.getAverageRate());
        recipeView.setPortionCount(recipe.getPortionCount());
        recipeView.setCreatedAt(recipe.getCreatedAt());
        recipeView.setUpdatedAt(recipe.getUpdatedAt());
        recipeView.setImages(this.imageViewFactory.makeList(recipe.getImages()));

        return recipeView;
    }

    public List<RecipeView> makeList(Page<AverageRateRecipe> averageRateRecipesPage) {
        return averageRateRecipesPage.getContent()
                .stream()
                .map(this::make)
                .collect(Collectors.toList());
    }
}
