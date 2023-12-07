package pjwstk.receipemate.app.viewfactory.category.recipe;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.view.category.recipe.CategoryRecipesPageView;
import pjwstk.receipemate.app.view.category.CategoryView;

import java.util.List;

@Service
public class CategoryRecipesPageViewFactory {
    public CategoryRecipesPageView makeList(Page<?> page, List<?> items, CategoryView categoryView) {
        CategoryRecipesPageView categoryRecipesPageView = new CategoryRecipesPageView();

        categoryRecipesPageView.setCategory(categoryView);
        categoryRecipesPageView.setPageNumber(page.getPageable().getPageNumber());
        categoryRecipesPageView.setPageSize(page.getPageable().getPageSize());
        categoryRecipesPageView.setTotalPages(page.getTotalPages());
        categoryRecipesPageView.setTotalElements(page.getTotalElements());
        categoryRecipesPageView.setItems(items);

        return categoryRecipesPageView;
    }
}
