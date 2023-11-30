package pjwstk.receipemate.app.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "recipe_ingredient")
public class RecipeIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    @JsonBackReference
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name = "ingredient_id")
    @JsonManagedReference
    private Ingredient ingredient;

    @NotBlank(message = "Count is mandatory")
    private Integer count;

    @ManyToOne
    @JoinColumn(name = "measure_id")
    @JsonManagedReference
    private Measure measure;
}
