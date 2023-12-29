package pjwstk.receipemate.app.viewfactory.category;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.Category;
import pjwstk.receipemate.app.view.category.CategoryView;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryViewFactory {
    private final CategoryImageViewFactory categoryImageViewFactory;

    public CategoryViewFactory(CategoryImageViewFactory categoryImageViewFactory) {
        this.categoryImageViewFactory = categoryImageViewFactory;
    }

    public CategoryView make(Category category) {
        if (category == null) return null;

        CategoryView categoryView = new CategoryView();

        categoryView.setId(category.getId());
        categoryView.setName(category.getName());
        categoryView.setImage(categoryImageViewFactory.make(category.getCategoryImage()));

        return categoryView;
    }

    public List<CategoryView> makeList(List<Category> categories) {
        if (categories == null) return null;

        return categories.stream()
                .map(this::make)
                .collect(Collectors.toList());
    }
}
