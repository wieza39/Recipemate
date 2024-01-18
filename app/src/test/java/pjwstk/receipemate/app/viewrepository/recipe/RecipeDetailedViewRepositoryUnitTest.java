package pjwstk.receipemate.app.viewrepository.recipe;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import pjwstk.receipemate.app.entity.Recipe;
import pjwstk.receipemate.app.exception.NotFoundException;
import pjwstk.receipemate.app.model.AverageRateRecipe;
import pjwstk.receipemate.app.repository.recipe.AverageRateRecipeRepository;
import pjwstk.receipemate.app.view.recipe.RecipeDetailedView;
import pjwstk.receipemate.app.view.recipe.RecipeView;
import pjwstk.receipemate.app.viewfactory.recipe.RecipeDetailedViewFactory;
import pjwstk.receipemate.app.viewfactory.recipe.RecipeViewFactory;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RecipeDetailedViewRepositoryUnitTest {
    @Mock
    private AverageRateRecipeRepository averageRateRecipeRepository;
    @Mock
    private RecipeDetailedViewFactory recipeDetailedViewFactory;
    @Mock
    private RecipeViewFactory recipeViewFactory;
    @InjectMocks
    private RecipeDetailedViewRepository recipeDetailedViewRepository;

    @Test
    public void shouldFindByIdMethodReturnNotFoundException() {
        // given
        Pageable pageable = Pageable.unpaged();

        // when
        when(this.averageRateRecipeRepository.findById(anyLong())).thenReturn(Optional.empty());
        NotFoundException exception = assertThrows(NotFoundException.class, () -> this.recipeDetailedViewRepository.find(0, pageable));

        // then
        assertEquals("Recipe not found!", exception.getMessage());
    }

    @Test
    public void shouldFindMethodReturnValidRecipeDetailedView() {
        // given
        Pageable pageable = Pageable.unpaged();

        // when
        Optional<AverageRateRecipe> recipe = Optional.of(new AverageRateRecipe(new Recipe(), 1.0));
        when(this.averageRateRecipeRepository.findById(anyLong())).thenReturn(recipe);

        List<AverageRateRecipe> relatedRecipesList = List.of(new AverageRateRecipe(null, null), new AverageRateRecipe(null, null));
        Page<AverageRateRecipe> relatedRecipes = new PageImpl<>(relatedRecipesList);
        when(this.averageRateRecipeRepository.getRelated(eq(recipe.get().getRecipe()), any(Pageable.class))).thenReturn(relatedRecipes);

        List<RecipeView> expectedRecipesViews = List.of(new RecipeView());
        when(this.recipeViewFactory.makeList(relatedRecipes.getContent())).thenReturn(expectedRecipesViews);

        RecipeDetailedView expectedRecipeDetailedView = new RecipeDetailedView();
        expectedRecipeDetailedView.setRating(1.0);
        when(this.recipeDetailedViewFactory.make(recipe.get(), expectedRecipesViews)).thenReturn(expectedRecipeDetailedView);

        RecipeDetailedView resultedRecipeDetailedView = this.recipeDetailedViewRepository.find(1, pageable);

        // then
        assertThat(resultedRecipeDetailedView).isEqualTo(expectedRecipeDetailedView);
        assertThat(resultedRecipeDetailedView.getRating()).isEqualTo(1.0);
    }
}