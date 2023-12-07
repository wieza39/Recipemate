package pjwstk.receipemate.app.view.recipe.step;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecipeStepView {
    private long id;
    private Integer order;
    private String title;
    private String description;
}
