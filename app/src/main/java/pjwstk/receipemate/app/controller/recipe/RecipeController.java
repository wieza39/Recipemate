package pjwstk.receipemate.app.controller.recipe;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import pjwstk.receipemate.app.request.RecipeFindRequest;
import pjwstk.receipemate.app.view.recipe.RecipeDetailedView;
import pjwstk.receipemate.app.viewrepository.recipe.RecipeDetailedViewRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/recipe")
public class RecipeController {
    private final RecipeDetailedViewRepository recipeDetailedViewRepository;

    public RecipeController(RecipeDetailedViewRepository recipeDetailedViewRepository) {
        this.recipeDetailedViewRepository = recipeDetailedViewRepository;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public RecipeDetailedView find(
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
        return this.recipeDetailedViewRepository.find(id, pageable);
    }
}
