package pjwstk.receipemate.app.view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pjwstk.receipemate.app.entity.Category;

import java.time.Instant;
import java.util.List;

@AllArgsConstructor
@Getter
public class RecipeView {
    private long id;

    private String name;

    private String description;

    private String timeConsuming;

    private String difficulty;

    private Category category;

    private Instant createdAt;

    private Instant updatedAt;

    private List<ImageView> images;
}
