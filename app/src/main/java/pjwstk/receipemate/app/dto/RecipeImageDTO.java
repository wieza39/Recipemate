package pjwstk.receipemate.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RecipeImageDTO {
    private String href;
    private String alt;
    private String title;
    private Boolean isMain;
}
