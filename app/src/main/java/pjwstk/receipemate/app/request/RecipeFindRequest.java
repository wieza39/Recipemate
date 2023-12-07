package pjwstk.receipemate.app.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RecipeFindRequest {
    private Integer relatedRecipesLimit;
}
