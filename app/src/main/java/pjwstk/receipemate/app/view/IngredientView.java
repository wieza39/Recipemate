package pjwstk.receipemate.app.view;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class IngredientView {
    private final long id;
    private final String name;
    private final Integer count;
    private final String  measure;
}
