package pjwstk.receipemate.app.controller.category;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pjwstk.receipemate.app.view.PageView;
import pjwstk.receipemate.app.viewrepository.category.CategoryViewRepository;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CategoryViewRepository categoryViewRepository;

    public CategoryController(CategoryViewRepository categoryViewRepository) {
        this.categoryViewRepository = categoryViewRepository;
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<PageView> getAll(
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "12") int limit
    ) {
        Pageable pageable = PageRequest.of(pageNumber, limit);
        return ResponseEntity.ok(categoryViewRepository.getList(pageable));
    }
}
