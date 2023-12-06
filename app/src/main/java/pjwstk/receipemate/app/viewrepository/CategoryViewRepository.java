package pjwstk.receipemate.app.viewrepository;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.Category;
import pjwstk.receipemate.app.repository.CategoryRepository;
import pjwstk.receipemate.app.view.category.CategoryView;
import pjwstk.receipemate.app.viewfactory.category.CategoryViewFactory;

import java.util.List;

@Service
public class CategoryViewRepository {
    private final CategoryRepository categoryRepository;
    private final CategoryViewFactory categoryViewFactory;

    public CategoryViewRepository(CategoryRepository categoryRepository, CategoryViewFactory categoryViewFactory) {
        this.categoryRepository = categoryRepository;
        this.categoryViewFactory = categoryViewFactory;
    }

    public List<CategoryView> getList() {
        List<Category> categories = this.categoryRepository.findAll();

        return this.categoryViewFactory.makeList(categories);
    }
}
