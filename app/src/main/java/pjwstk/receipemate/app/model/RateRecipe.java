package pjwstk.receipemate.app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RateRecipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    RateRecipeKey id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @MapsId("recipeId")
    @JoinColumn(name = "recipe_id")
    Recipe recipe;

    @Min(1)
    @Max(5)
    @NotBlank(message = "Value is mandatory")
    int value;
}
