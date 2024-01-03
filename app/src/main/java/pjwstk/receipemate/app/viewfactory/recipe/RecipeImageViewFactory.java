package pjwstk.receipemate.app.viewfactory.recipe;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.RecipeImage;
import pjwstk.receipemate.app.view.recipe.RecipeImageView;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeImageViewFactory {
    public RecipeImageView make(RecipeImage image) {
        if (image == null) return null;

        RecipeImageView recipeImageView = new RecipeImageView();

        recipeImageView.setHref(image.getHref());
        recipeImageView.setAlt(image.getAlt());
        recipeImageView.setTitle(image.getTitle());
        recipeImageView.setIsMain(image.isMain());

        return recipeImageView;
    }

    public List<RecipeImageView> makeList(List<RecipeImage> images) {
        if (images == null || images.isEmpty()) return null;

        return images.stream()
                .map(this::make)
                .collect(Collectors.toList());
    }
}
