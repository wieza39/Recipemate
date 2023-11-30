package pjwstk.receipemate.app.factory;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.Recipe;
import pjwstk.receipemate.app.view.RecipeView;

@Service
public class RecipeViewFactory {
    private final ImageViewFactory imageViewFactory;

    public RecipeViewFactory(ImageViewFactory imageViewFactory) {
        this.imageViewFactory = imageViewFactory;
    }

    public RecipeView make(Recipe recipe) {
        return new RecipeView(
                recipe.getId(),
                recipe.getName(),
                recipe.getDescription(),
                recipe.getTimeConsuming(),
                recipe.getDifficulty(),
                recipe.getCategory(),
                recipe.getCreatedAt(),
                recipe.getUpdatedAt(),
                this.imageViewFactory.makeList(recipe.getImages())
        );
    }
}
