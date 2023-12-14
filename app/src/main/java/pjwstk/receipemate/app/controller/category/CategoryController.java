package pjwstk.receipemate.app.controller.category;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pjwstk.receipemate.app.view.category.CategoryView;
import pjwstk.receipemate.app.viewrepository.category.CategoryViewRepository;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CategoryViewRepository categoryViewRepository;

    public CategoryController(CategoryViewRepository categoryViewRepository) {
        this.categoryViewRepository = categoryViewRepository;
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<CategoryView>> getAll() {
        return ResponseEntity.ok(categoryViewRepository.getList());
    }
}
