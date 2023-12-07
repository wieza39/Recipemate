package pjwstk.receipemate.app.viewfactory.category.recipe;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.view.category.recipe.CategoryRecipesPageView;
import pjwstk.receipemate.app.view.category.CategoryView;

import java.util.List;

@Service
public class CategoryRecipesPageViewFactory {
    public CategoryRecipesPageView makeList(Page<?> page, List<?> items, CategoryView categoryView) {
        return new CategoryRecipesPageView(
                page.getPageable().getPageNumber(),
                page.getPageable().getPageSize(),
                page.getTotalElements(),
                page.getTotalPages(),
                items,
                categoryView
        );
    }
}
