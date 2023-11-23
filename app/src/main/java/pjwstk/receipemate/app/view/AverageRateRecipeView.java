package pjwstk.receipemate.app.view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pjwstk.receipemate.app.entity.Category;

import java.time.Instant;

@Getter
@AllArgsConstructor
public class AverageRateRecipeView {
    private long id;

    private String name;

    private String description;

    private String timeConsuming;

    private String difficulty;

    private Category category;

    private Instant createdAt;

    private Instant updatedAt;

    private Double averageRecipe;

    private ImageView image;
}
