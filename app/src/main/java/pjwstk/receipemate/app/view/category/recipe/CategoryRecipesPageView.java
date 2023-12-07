package pjwstk.receipemate.app.view.category.recipe;

import lombok.Getter;
import lombok.Setter;
import pjwstk.receipemate.app.view.PageView;
import pjwstk.receipemate.app.view.category.CategoryView;

import java.util.List;

@Getter
@Setter
public class CategoryRecipesPageView extends PageView {

    CategoryView categoryView;

    public CategoryRecipesPageView(int pageNumber, int pageSize, long totalElements, int totalPages, List<?> items, CategoryView categoryView) {
        super(pageNumber, pageSize, totalElements, totalPages, items);
        this.categoryView = categoryView;
    }
}
