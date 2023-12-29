package pjwstk.receipemate.app.viewrepository.recipe;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import pjwstk.receipemate.app.exception.NotFoundException;
import pjwstk.receipemate.app.model.AverageRateRecipe;
import pjwstk.receipemate.app.repository.recipe.AverageRateRecipeRepository;
import pjwstk.receipemate.app.view.page.PageView;
import pjwstk.receipemate.app.view.recipe.RecipeView;
import pjwstk.receipemate.app.viewfactory.page.PageViewFactory;
import pjwstk.receipemate.app.viewfactory.recipe.RecipeViewFactory;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PopularRecipeViewRepositoryUnitTest {
    @Mock
    AverageRateRecipeRepository averageRateRecipeRepository;

    @Mock
    RecipeViewFactory recipeViewFactory;

    @Mock
    PageViewFactory pageViewFactory;

    @InjectMocks
    PopularRecipeViewRepository popularRecipeViewRepository;

    @Test
    void shouldThrowNotFoundException() {
        // given
        Pageable pageable = Pageable.unpaged();

        // when
        when(this.averageRateRecipeRepository.getPopular(any(Pageable.class))).thenReturn(Page.empty());
        NotFoundException exception = assertThrows(NotFoundException.class, () -> this.popularRecipeViewRepository.getList(pageable));

        // then
        assertEquals("Recipes not found!", exception.getMessage());
    }

    @Test
    void shouldReturnPageView() {
        // given
        Pageable pageable = Pageable.unpaged();

        // when
        List<AverageRateRecipe> recipes = List.of(
                new AverageRateRecipe(null, null),
                new AverageRateRecipe(null, null)
        );
        Page<AverageRateRecipe> pageWithRecipes = new PageImpl<>(recipes);
        when(this.averageRateRecipeRepository.getPopular(any(Pageable.class))).thenReturn(pageWithRecipes);

        List<RecipeView> recipeViews = List.of(
                new RecipeView(),
                new RecipeView()
        );
        when(this.recipeViewFactory.makeList(recipes)).thenReturn(recipeViews);

        PageView expectedPageView = new PageView();
        when(this.pageViewFactory.make(pageWithRecipes, recipeViews)).thenReturn(expectedPageView);

        PageView result = this.popularRecipeViewRepository.getList(pageable);

        //then
        assertThat(result).isEqualTo(expectedPageView);
    }
}