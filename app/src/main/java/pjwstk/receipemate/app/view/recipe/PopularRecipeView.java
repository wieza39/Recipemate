package pjwstk.receipemate.app.view.recipe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pjwstk.receipemate.app.entity.Category;
import pjwstk.receipemate.app.view.ImageView;

import java.time.Instant;
import java.util.List;

@Getter
@AllArgsConstructor
public class PopularRecipeView {
    private long id;

    private String name;

    private String description;

    private String timeConsuming;

    private String difficulty;

    private Category category;

    private Instant createdAt;

    private Instant updatedAt;

    private Double averageRating;

    private List<ImageView> images;
}
