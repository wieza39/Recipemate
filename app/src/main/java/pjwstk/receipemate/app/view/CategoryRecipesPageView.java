package pjwstk.receipemate.app.view;

import lombok.Getter;
import lombok.Setter;

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
