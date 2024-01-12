package pjwstk.receipemate.app.controller.recipe;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pjwstk.receipemate.app.request.RecipeFindRequest;
import pjwstk.receipemate.app.view.page.PageView;
import pjwstk.receipemate.app.view.recipe.RecipeDetailedView;
import pjwstk.receipemate.app.viewrepository.recipe.RecipeDetailedViewRepository;
import pjwstk.receipemate.app.viewrepository.recipe.RecipeViewRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/recipe")
public class RecipeController {
    private final RecipeDetailedViewRepository recipeDetailedViewRepository;
    private final RecipeViewRepository recipeViewRepository;

    public RecipeController(
            RecipeDetailedViewRepository recipeDetailedViewRepository,
            RecipeViewRepository recipeViewRepository
    ) {
        this.recipeDetailedViewRepository = recipeDetailedViewRepository;
        this.recipeViewRepository = recipeViewRepository;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<RecipeDetailedView> find(
            @PathVariable(value = "id") long id,
            @RequestBody(required = false) RecipeFindRequest recipeFindRequest
    ) {
        int relatedRecipesLimit = 4;

        if (recipeFindRequest != null && recipeFindRequest.getRelatedRecipesLimit() != null) {
            relatedRecipesLimit = recipeFindRequest.getRelatedRecipesLimit();
        }

        Pageable pageable = PageRequest.of(
                0,
                relatedRecipesLimit
        );
        return ResponseEntity.ok(this.recipeDetailedViewRepository.find(id, pageable));
    }

    @GetMapping("/search")
    @ResponseBody
    public ResponseEntity<PageView> getByPhrase(
            @RequestParam String phrase,
            @RequestParam(defaultValue = "1") int pageNumber,
            @RequestParam(defaultValue = "12") int limit
    ) {
        Pageable pageable = PageRequest.of(pageNumber - 1, limit);
        return ResponseEntity.ok(this.recipeViewRepository.getByPhrase(phrase, pageable));
    }
}
