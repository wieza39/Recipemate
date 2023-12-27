package pjwstk.receipemate.app.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SourceType;
import org.hibernate.annotations.UpdateTimestamp;
import pjwstk.receipemate.app.enums.RecipeDifficulty;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @Column(columnDefinition = "TEXT")
    @NotBlank(message = "Description is mandatory")
    private String description;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RecipeStep> steps;

    @Min(value = 1, message = "Portion count must be at least 1.")
    private Integer portionCount;

    @NotBlank(message = "Time consuming is mandatory")
    private String timeConsuming;

    @Enumerated(EnumType.STRING)
    @NotNull
    private RecipeDifficulty difficulty;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    @JsonManagedReference
    private Category category;

    @OneToMany
    @JoinColumn(name = "recipe_id", referencedColumnName = "id")
    @JsonManagedReference
    @org.hibernate.annotations.OrderBy(clause = "is_main DESC")
    private List<RecipeImage> images;

    @CreationTimestamp(source = SourceType.DB)
    private LocalDateTime createdAt;

    @UpdateTimestamp(source = SourceType.DB)
    private LocalDateTime updatedAt;

    @OneToMany
    @JoinColumn(name = "recipe_id", referencedColumnName = "id")
    @JsonBackReference
    List<RecipeIngredient> ingredients;
}
