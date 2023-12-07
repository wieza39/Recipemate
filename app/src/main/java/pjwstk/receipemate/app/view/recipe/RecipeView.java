package pjwstk.receipemate.app.view.recipe;

import lombok.Getter;
import lombok.Setter;
import pjwstk.receipemate.app.entity.Category;
import pjwstk.receipemate.app.view.ImageView;

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

    private Instant createdAt;

    private Instant updatedAt;

    private Double rating;

    private Integer portionCount;

    private List<ImageView> images;
}
