package pjwstk.receipemate.app.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "recipe_image")
public class RecipeImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "recipe_id", referencedColumnName = "id")
    @JsonBackReference
    private Recipe recipe;

    @NotBlank(message = "Name is mandatory")
    private String name;

    private boolean isMain = false;

    @NotBlank(message = "Alt is mandatory")
    private String alt;

    @NotBlank(message = "Title is mandatory")
    private String title;
}
