package pjwstk.receipemate.app.view.recipe.step;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RecipeStepView {
    private long id;
    private Integer order;
    private String title;
    private String description;
}
