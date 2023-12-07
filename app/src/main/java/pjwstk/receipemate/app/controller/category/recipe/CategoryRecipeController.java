package pjwstk.receipemate.app.controller.category.recipe;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pjwstk.receipemate.app.view.PageView;
import pjwstk.receipemate.app.viewrepository.CategoryRecipesPageViewRepository;

@RestController
@RequestMapping("/category")
public class CategoryRecipeController {
    private final CategoryRecipesPageViewRepository categoryRecipesPageViewRepository;

    public CategoryRecipeController(CategoryRecipesPageViewRepository categoryRecipesPageViewRepository) {
        this.categoryRecipesPageViewRepository = categoryRecipesPageViewRepository;
    }

    @GetMapping("/{id}/recipes")
    @ResponseBody
    public ResponseEntity<PageView> getById(
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "12") int limit,
            @PathVariable(value = "id") long categoryId
    ) {
        Pageable pageable = PageRequest.of(pageNumber, limit);
        return ResponseEntity.ok(categoryRecipesPageViewRepository.getList(pageable, categoryId));
    }
}