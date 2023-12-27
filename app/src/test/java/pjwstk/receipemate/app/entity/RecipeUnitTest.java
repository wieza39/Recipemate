package pjwstk.receipemate.app.entity;

import org.junit.jupiter.api.Test;
import pjwstk.receipemate.app.enums.RecipeDifficulty;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

class RecipeUnitTest {
    @Test
    public void shouldInitializeRecipe() {
        Recipe recipe = new Recipe();
        recipe.setId(1);
        recipe.setName("Test name");
        recipe.setDescription("Test description");
        recipe.setDifficulty(RecipeDifficulty.HARD);
        recipe.setCategory(null);
        recipe.setUpdatedAt(LocalDateTime.now());

        assertThat(recipe.getId()).isEqualTo(1);
        assertThat(recipe.getName()).isEqualTo("Test name");
        assertThat(recipe.getDescription()).isEqualTo("Test description");
        assertThat(recipe.getDifficulty()).isEqualTo(RecipeDifficulty.HARD);
        assertThat(recipe.getCategory()).isEqualTo(null);
    }
}