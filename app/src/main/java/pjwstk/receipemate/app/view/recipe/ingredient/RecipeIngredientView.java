package pjwstk.receipemate.app.view.recipe.ingredient;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RecipeIngredientView {
    private final long id;
    private final String name;
    private final Integer count;
    private final String  measure;
}
