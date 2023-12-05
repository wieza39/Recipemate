package pjwstk.receipemate.app.viewfactory.recipe.ingredient;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.RecipeIngredient;
import pjwstk.receipemate.app.view.recipe.ingredient.RecipeIngredientView;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeIngredientViewFactory {
    public RecipeIngredientView make(RecipeIngredient recipeIngredient) {
        if (recipeIngredient == null) return null;

        return new RecipeIngredientView(
                recipeIngredient.getIngredient().getId(),
                recipeIngredient.getIngredient().getName(),
                recipeIngredient.getCount(),
                recipeIngredient.getMeasure().getName()
        );
    }

    public List<RecipeIngredientView> makeList(List<RecipeIngredient> recipeIngredients) {
        return recipeIngredients.stream()
                .map(this::make)
                .collect(Collectors.toList());
    }
}
