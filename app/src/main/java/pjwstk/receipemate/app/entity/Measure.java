package pjwstk.receipemate.app.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "measure")
public class Measure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @OneToMany
    @JoinColumn(name = "measure_id", referencedColumnName = "id")
    @JsonBackReference
    List<RecipeIngredient> recipeIngredient;
}
