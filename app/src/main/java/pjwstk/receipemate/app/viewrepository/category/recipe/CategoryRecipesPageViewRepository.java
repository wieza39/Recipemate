package pjwstk.receipemate.app.viewrepository.category.recipe;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.Category;
import pjwstk.receipemate.app.exception.NotFoundException;
import pjwstk.receipemate.app.model.AverageRateRecipe;
import pjwstk.receipemate.app.repository.category.CategoryRepository;
import pjwstk.receipemate.app.repository.recipe.AverageRateRecipeRepository;
import org.springframework.data.domain.Pageable;
import pjwstk.receipemate.app.view.category.recipe.CategoryRecipesPageView;
import pjwstk.receipemate.app.view.recipe.RecipeView;
import pjwstk.receipemate.app.viewfactory.category.recipe.CategoryRecipesPageViewFactory;
import pjwstk.receipemate.app.viewfactory.category.CategoryViewFactory;
import pjwstk.receipemate.app.viewfactory.recipe.RecipeViewFactory;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryRecipesPageViewRepository {
    private final CategoryRepository categoryRepository;
    private final AverageRateRecipeRepository averageRateRecipeRepository;
    private final RecipeViewFactory recipeViewFactory;
    private final CategoryRecipesPageViewFactory categoryRecipesPageViewFactory;
    private final CategoryViewFactory categoryViewFactory;

    public CategoryRecipesPageViewRepository(
            CategoryRepository categoryRepository,
            AverageRateRecipeRepository averageRateRecipeRepository,
            CategoryRecipesPageViewFactory categoryRecipesPageViewFactory,
            CategoryViewFactory categoryViewFactory,
            RecipeViewFactory recipeViewFactory
    ) {
        this.categoryRepository = categoryRepository;
        this.averageRateRecipeRepository = averageRateRecipeRepository;
        this.categoryRecipesPageViewFactory = categoryRecipesPageViewFactory;
        this.categoryViewFactory = categoryViewFactory;
        this.recipeViewFactory = recipeViewFactory;
    }

    public CategoryRecipesPageView getList(Pageable pageable, long categoryId) {
        Optional<Category> category = this.categoryRepository.findById(categoryId);

        if (category.isEmpty()) {
            throw new NotFoundException("Category not found");
        }

        Page<AverageRateRecipe> averageRateRecipesPage = this.averageRateRecipeRepository.getByCategoryId(pageable, category.get());
        List<RecipeView> recipeDetailedViewList = this.recipeViewFactory.makeList(averageRateRecipesPage.getContent());

        return this.categoryRecipesPageViewFactory.makeList(
                averageRateRecipesPage,
                recipeDetailedViewList,
                this.categoryViewFactory.make(category.get())
        );
    }
}
