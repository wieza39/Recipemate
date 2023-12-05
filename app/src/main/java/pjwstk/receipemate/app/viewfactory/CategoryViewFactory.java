package pjwstk.receipemate.app.viewfactory;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.Category;
import pjwstk.receipemate.app.view.CategoryView;

@Service
public class CategoryViewFactory {

    public CategoryView make(Category category) {
        CategoryView categoryView = new CategoryView();

        categoryView.setId(category.getId());
        categoryView.setName(category.getName());

        return categoryView;
    }

}
