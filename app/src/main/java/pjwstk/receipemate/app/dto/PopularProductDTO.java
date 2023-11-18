package pjwstk.receipemate.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pjwstk.receipemate.app.entity.Category;

import java.time.Instant;

@Getter
@AllArgsConstructor
public class PopularProductDTO {
    private long id;

    private String name;

    private String description;

    private String timeConsuming;

    private String difficulty;

    private Category category;

    private Instant createdAt;

    private Instant updatedAt;

    private Double averageRecipe;
}
