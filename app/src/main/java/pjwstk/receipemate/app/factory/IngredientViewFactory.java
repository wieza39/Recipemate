package pjwstk.receipemate.app.factory;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.RecipeIngredient;
import pjwstk.receipemate.app.view.IngredientView;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IngredientViewFactory {
    public IngredientView make(RecipeIngredient ingredient) {
        if (ingredient == null) return null;

        return new IngredientView(
                ingredient.getIngredient().getId(),
                ingredient.getIngredient().getName(),
                ingredient.getCount(),
                ingredient.getMeasure().getName()
        );
    }

    public List<IngredientView> makeList(List<RecipeIngredient> recipeIngredients) {
        return recipeIngredients.stream()
                .map(this::make)
                .collect(Collectors.toList());
    }
}
