package pjwstk.receipemate.app.view.recipe.ingredient;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecipeIngredientView {
    private long id;
    private String name;
    private Integer count;
    private String measure;
}
