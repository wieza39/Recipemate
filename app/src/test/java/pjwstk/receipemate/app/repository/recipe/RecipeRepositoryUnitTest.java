package pjwstk.receipemate.app.repository.recipe;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pjwstk.receipemate.app.entity.Recipe;
import pjwstk.receipemate.app.enums.RecipeDifficulty;

import java.time.LocalDateTime;

@SpringBootTest
@Transactional
public class RecipeRepositoryUnitTest {
    @Autowired
    private RecipeRepository recipeRepository;

    @Test
    public void shouldSaveRecipe() {
        Recipe recipe = new Recipe();
        recipe.setName("Test name");
        recipe.setDescription("Test description");
        recipe.setDifficulty(RecipeDifficulty.HARD);
        System.out.println(recipe.getDifficulty());
        recipe.setCategory(null);
        recipe.setTimeConsuming("45");
        recipe.setUpdatedAt(LocalDateTime.now());

        this.recipeRepository.save(recipe);
    }
}