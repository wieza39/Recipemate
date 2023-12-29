package pjwstk.receipemate.app.view.recipe;

import lombok.Getter;
import lombok.Setter;
import pjwstk.receipemate.app.view.image.ImageView;
import pjwstk.receipemate.app.view.category.CategoryView;
import pjwstk.receipemate.app.view.recipe.ingredient.RecipeIngredientView;
import pjwstk.receipemate.app.view.recipe.step.RecipeStepView;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class RecipeDetailedView {
    private long id;

    private String name;

    private String description;

    private String timeConsuming;

    private String difficulty;

    private CategoryView category;

    private Double rating;

    private Integer portionCount;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private List<ImageView> images;

    private List<RecipeIngredientView> ingredients;

    private List<RecipeStepView> steps;

    private List<RecipeView> relatedRecipes;
}
