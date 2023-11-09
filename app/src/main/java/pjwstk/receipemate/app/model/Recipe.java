package pjwstk.receipemate.app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SourceType;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "Description is mandatory")
    private String description;

    @NotBlank(message = "Steps description is mandatory")
    private String stepsDescriptions;

    @NotBlank(message = "Time consuming is mandatory")
    private String timeConsuming;

    @NotBlank(message = "Difficult is mandatory")
    private String difficult;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @CreationTimestamp(source = SourceType.DB)
    private Instant created_at;

    @UpdateTimestamp(source = SourceType.DB)
    private Instant updated_at;

    @ManyToMany(mappedBy = "favouriteRecipes")
    Set<User> favourites;

    @OneToMany(mappedBy = "recipe")
    Set<RecipeIngredient> recipeIngredients;

    @ManyToMany
    @JoinTable(
            name = "comment_recipe",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    Set<User> commentators;
}
