package pjwstk.receipemate.app.viewrepository;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.Category;
import pjwstk.receipemate.app.exception.NotFoundException;
import pjwstk.receipemate.app.model.AverageRateRecipe;
import pjwstk.receipemate.app.repository.CategoryRepository;
import pjwstk.receipemate.app.repository.recipe.AverageRateRecipeRepository;

import org.springframework.data.domain.Pageable;
import pjwstk.receipemate.app.view.CategoryRecipesPageView;
import pjwstk.receipemate.app.view.recipe.RecipeView;
import pjwstk.receipemate.app.viewfactory.CategoryRecipesPageViewFactory;
import pjwstk.receipemate.app.viewfactory.CategoryViewFactory;
import pjwstk.receipemate.app.viewfactory.recipe.RecipeViewFactory;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryRecipesPageViewRepository {

    private final CategoryRepository categoryRepository;
    private final AverageRateRecipeRepository averageRateRecipeRepository;
    private final CategoryRecipesPageViewFactory categoryRecipesPageViewFactory;
    private final CategoryViewFactory categoryViewFactory;
    private final RecipeViewFactory recipeViewFactory;

    public CategoryRecipesPageViewRepository(CategoryRepository categoryRepository, AverageRateRecipeRepository averageRateRecipeRepository, CategoryRecipesPageViewFactory categoryRecipesPageViewFactory, CategoryViewFactory categoryViewFactory, RecipeViewFactory recipeViewFactory) {
        this.categoryRepository = categoryRepository;
        this.averageRateRecipeRepository = averageRateRecipeRepository;
        this.categoryRecipesPageViewFactory = categoryRecipesPageViewFactory;
        this.categoryViewFactory = categoryViewFactory;
        this.recipeViewFactory = recipeViewFactory;
    }

    public CategoryRecipesPageView getList(Pageable pageable, long categoryId) {

        Optional<Category> category = this.categoryRepository.findById(categoryId);

        if (category.isEmpty()) {
            throw new NotFoundException("Recipes not found");
        }

        Page<AverageRateRecipe> averageRateRecipesPage = this.averageRateRecipeRepository.getByCategoryId(pageable, category.get());
        List<RecipeView> recipeViewList = this.recipeViewFactory.makeList(averageRateRecipesPage);

        return this.categoryRecipesPageViewFactory.makeList(
                averageRateRecipesPage,
                recipeViewList,
                this.categoryViewFactory.make(category.get())
        );


    }
}
