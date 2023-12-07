package pjwstk.receipemate.app.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "First name is mandatory")
    private String firstName;

    @NotBlank(message = "Second name is mandatory")
    private String secondName;

    @NotEmpty(message = "Email is mandatory")
    @Email
    @Size(max = 255)
    @Column(unique = true)
    private String email;

    @NotBlank(message = "Password is mandatory")
    private String password;

    @ManyToMany
    @JoinTable(
            name = "favourite_recipe",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "recipe_id"))
    Set<Recipe> favouriteRecipes;

    @OneToMany(mappedBy = "user")
    Set<CommentRecipe> comments;
}
