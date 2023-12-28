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
import pjwstk.receipemate.app.view.PageView;
import pjwstk.receipemate.app.view.recipe.RecipeView;
import pjwstk.receipemate.app.viewfactory.PageViewFactory;
import pjwstk.receipemate.app.viewfactory.recipe.RecipeViewFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RecipeViewRepositoryUnitTest {
    @Mock
    AverageRateRecipeRepository averageRateRecipeRepository;
    @Mock
    RecipeViewFactory recipeViewFactory;
    @Mock
    PageViewFactory pageViewFactory;
    @InjectMocks
    RecipeViewRepository recipeViewRepository;

    @Test
    void shouldGetByPhraseMethodThrowNotFoundException() {
        // given
        String phrase = "test phrase";
        Pageable pageable = Pageable.unpaged();

        // when
        when(averageRateRecipeRepository.getByPhrase(anyString(), any(Pageable.class))).thenReturn(Page.empty());
        NotFoundException exception = assertThrows(NotFoundException.class, () -> recipeViewRepository.getByPhrase(phrase, pageable));

        // then
        assertEquals(exception.getMessage(), "Recipes not found!");
    }

    @Test
    void shouldGetByPhraseMethodReturnRecipeView() {
        // given
        String phrase = "test phrase";
        Pageable pageable = Pageable.unpaged();

        // when
        List<AverageRateRecipe> recipes = List.of(
                new AverageRateRecipe(null, null)
        );
        Page<AverageRateRecipe> averageRateRecipePage = new PageImpl<>(recipes);
        when(averageRateRecipeRepository.getByPhrase(anyString(), any(Pageable.class))).thenReturn(averageRateRecipePage);

        List<RecipeView> recipeViews = List.of(
                new RecipeView()
        );
        when(recipeViewFactory.makeList(averageRateRecipePage.getContent())).thenReturn(recipeViews);

        PageView expectedPageView = new PageView();
        when(pageViewFactory.make(averageRateRecipePage, recipeViews)).thenReturn(expectedPageView);

        PageView pageView = recipeViewRepository.getByPhrase(phrase, pageable);

        // then
        assertEquals(expectedPageView, pageView);
    }
}