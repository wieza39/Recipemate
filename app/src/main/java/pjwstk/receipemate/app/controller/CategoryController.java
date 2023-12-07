package pjwstk.receipemate.app.controller;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pjwstk.receipemate.app.view.category.CategoryView;
import pjwstk.receipemate.app.view.PageView;
import pjwstk.receipemate.app.viewrepository.CategoryRecipesPageViewRepository;
import pjwstk.receipemate.app.viewrepository.CategoryViewRepository;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CategoryRecipesPageViewRepository categoryRecipesPageViewRepository;

    private final CategoryViewRepository categoryViewRepository;

    public CategoryController(
            CategoryRecipesPageViewRepository categoryRecipesPageViewRepository,
            CategoryViewRepository categoryViewRepository
    ) {
        this.categoryRecipesPageViewRepository = categoryRecipesPageViewRepository;
        this.categoryViewRepository = categoryViewRepository;
    }

    @GetMapping("/{id}/recipes")
    @ResponseBody
    public ResponseEntity<PageView> getPopularRecipes(
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "12") int limit,
            @PathVariable(value = "id") long categoryId
    ) {
        Pageable pageable = PageRequest.of(pageNumber, limit);
        return ResponseEntity.ok(categoryRecipesPageViewRepository.getList(pageable, categoryId));
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<CategoryView>> getAll() {

        return ResponseEntity.ok(categoryViewRepository.getList());
    }
}
