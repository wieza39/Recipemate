package pjwstk.receipemate.app.viewrepository.category;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.entity.Category;
import pjwstk.receipemate.app.exception.NotFoundException;
import pjwstk.receipemate.app.repository.category.CategoryRepository;
import pjwstk.receipemate.app.view.page.PageView;
import pjwstk.receipemate.app.viewfactory.page.PageViewFactory;
import pjwstk.receipemate.app.viewfactory.category.CategoryViewFactory;

@Service
public class CategoryViewRepository {
    private final CategoryRepository categoryRepository;
    private final CategoryViewFactory categoryViewFactory;
    private final PageViewFactory pageViewFactory;

    public CategoryViewRepository(CategoryRepository categoryRepository, CategoryViewFactory categoryViewFactory, PageViewFactory pageViewFactory) {
        this.categoryRepository = categoryRepository;
        this.categoryViewFactory = categoryViewFactory;
        this.pageViewFactory = pageViewFactory;
    }

    public PageView getList(Pageable pageable) {
        Page<Category> categories = this.categoryRepository.getWithRecipes(pageable);

        if (categories.getContent().isEmpty()) {
            throw new NotFoundException("Categories not found");
        }

        return this.pageViewFactory.make(
                categories,
                this.categoryViewFactory.makeList(categories.getContent())
        );
    }
}
