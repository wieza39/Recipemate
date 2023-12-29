package pjwstk.receipemate.app.viewfactory.recipe;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.Recipe;
import pjwstk.receipemate.app.model.AverageRateRecipe;
import pjwstk.receipemate.app.view.recipe.RecipeView;
import pjwstk.receipemate.app.viewfactory.ImageViewFactory;
import pjwstk.receipemate.app.viewfactory.category.CategoryViewFactory;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeViewFactory {
    private final ImageViewFactory imageViewFactory;
    private final CategoryViewFactory categoryViewFactory;

    public RecipeViewFactory(
            ImageViewFactory imageViewFactory,
            CategoryViewFactory categoryViewFactory
    ) {
        this.imageViewFactory = imageViewFactory;
        this.categoryViewFactory = categoryViewFactory;
    }

    public RecipeView make(AverageRateRecipe averageRateRecipe) {
        Recipe recipe = averageRateRecipe.getRecipe();

        RecipeView recipeView = new RecipeView();

        recipeView.setId(recipe.getId());
        recipeView.setName(recipe.getName());
        recipeView.setDescription(recipe.getDescription());
        recipeView.setTimeConsuming(recipe.getTimeConsuming());
        recipeView.setDifficulty(recipe.getDifficulty().getType());
        recipeView.setCategory(this.categoryViewFactory.make(recipe.getCategory()));
        recipeView.setRating(averageRateRecipe.getAverageRate());
        recipeView.setPortionCount(recipe.getPortionCount());
        recipeView.setCreatedAt(recipe.getCreatedAt());
        recipeView.setUpdatedAt(recipe.getUpdatedAt());
        recipeView.setImages(this.imageViewFactory.makeList(recipe.getImages()));

        return recipeView;
    }

    public List<RecipeView> makeList(List<AverageRateRecipe> averageRateRecipesPage) {
        return averageRateRecipesPage
                .stream()
                .map(this::make)
                .collect(Collectors.toList());
    }
}
