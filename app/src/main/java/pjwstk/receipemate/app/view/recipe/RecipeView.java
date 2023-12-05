package pjwstk.receipemate.app.view.recipe;

import lombok.Getter;
import lombok.Setter;
import pjwstk.receipemate.app.entity.Category;
import pjwstk.receipemate.app.view.ImageView;
import pjwstk.receipemate.app.view.recipe.ingredient.RecipeIngredientView;
import pjwstk.receipemate.app.view.recipe.step.RecipeStepView;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
public class RecipeView {
    private long id;

    private String name;

    private String description;

    private String timeConsuming;

    private String difficulty;

    private Category category;

    private Double rating;

    private Integer portionCount;

    private Instant createdAt;

    private Instant updatedAt;

    private List<ImageView> images;

    private List<RecipeIngredientView> ingredients;

    private List<RecipeStepView> steps;
}
