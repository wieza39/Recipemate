package pjwstk.receipemate.app.service;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.repository.CategoryRepository;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
