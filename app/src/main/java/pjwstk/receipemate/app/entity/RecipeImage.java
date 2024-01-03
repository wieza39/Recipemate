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
public class RecipeImage implements Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    @JsonBackReference
    private Recipe recipe;

    @NotBlank(message = "Href is mandatory")
    private String href;

    @NotBlank(message = "Alt is mandatory")
    private String alt;

    @NotBlank(message = "Title is mandatory")
    private String title;

    private boolean isMain = false;
}
