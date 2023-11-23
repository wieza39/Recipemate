package pjwstk.receipemate.app.model;

import lombok.Getter;
import lombok.Setter;
import pjwstk.receipemate.app.entity.Recipe;
import pjwstk.receipemate.app.entity.RecipeImage;

@Getter
@Setter
public class AverageRateRecipe {
    private RecipeImage image;
    private Recipe recipe;
    private Double averageRate;

    public AverageRateRecipe(Recipe recipe, Double averageRate, RecipeImage image) {
        this.recipe = recipe;
        this.image = image;
        this.averageRate = averageRate;
    }
}
