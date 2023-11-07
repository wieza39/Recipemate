package pjwstk.receipemate.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class RateRecipeKey implements Serializable {
    @Column(name = "user_id")
    private long userId;

    @Column(name = "recipe_id")
    private long recipeId;
}
