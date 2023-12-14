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

        RecipeIngredientView recipeIngredientView = new RecipeIngredientView();

        recipeIngredientView.setId(recipeIngredient.getIngredient().getId());
        recipeIngredientView.setName(recipeIngredient.getIngredient().getName());
        recipeIngredientView.setCount(recipeIngredient.getCount());
        recipeIngredientView.setMeasure(recipeIngredient.getMeasure().getName());

        return recipeIngredientView;
    }

    public List<RecipeIngredientView> makeList(List<RecipeIngredient> recipeIngredients) {
        return recipeIngredients.stream()
                .map(this::make)
                .collect(Collectors.toList());
    }
}
