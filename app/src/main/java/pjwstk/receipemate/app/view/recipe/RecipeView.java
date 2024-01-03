package pjwstk.receipemate.app.view.recipe;

import lombok.Getter;
import lombok.Setter;
import pjwstk.receipemate.app.view.image.ImageView;
import pjwstk.receipemate.app.view.category.CategoryView;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class RecipeView {
    private long id;

    private String name;

    private String description;

    private String timeConsuming;

    private String difficulty;

    private CategoryView category;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Double rating;

    private Integer portionCount;

    private List<RecipeImageView> images;
}
