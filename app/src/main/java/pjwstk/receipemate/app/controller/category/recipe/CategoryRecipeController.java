package pjwstk.receipemate.app.controller.category.recipe;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pjwstk.receipemate.app.enums.RecipeSort;
import pjwstk.receipemate.app.resolver.RecipeSortResolver;
import pjwstk.receipemate.app.view.page.PageView;
import pjwstk.receipemate.app.viewrepository.category.recipe.CategoryRecipesPageViewRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/category")
public class CategoryRecipeController {
    private final CategoryRecipesPageViewRepository categoryRecipesPageViewRepository;
    private final RecipeSortResolver recipeSortResolver;

    public CategoryRecipeController(
            CategoryRecipesPageViewRepository categoryRecipesPageViewRepository,
            RecipeSortResolver recipeSortResolver
    ) {
        this.categoryRecipesPageViewRepository = categoryRecipesPageViewRepository;
        this.recipeSortResolver = recipeSortResolver;
    }

    @GetMapping("/{id}/recipes")
    @ResponseBody
    public ResponseEntity<PageView> getById(
            @RequestParam(defaultValue = "1") int pageNumber,
            @RequestParam(defaultValue = "12") int limit,
            @RequestParam(defaultValue = "popular", name = "type") RecipeSort recipeSort,
            @PathVariable(value = "id") long categoryId
    ) {
        Pageable pageable = PageRequest.of(
                pageNumber - 1,
                limit,
                this.recipeSortResolver.getSort(recipeSort)
        );

        return ResponseEntity.ok(this.categoryRecipesPageViewRepository.getList(
                categoryId,
                pageable
        ));
    }
}
