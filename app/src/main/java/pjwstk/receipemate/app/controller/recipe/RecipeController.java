package pjwstk.receipemate.app.controller.recipe;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import pjwstk.receipemate.app.request.RecipeFindRequest;
import pjwstk.receipemate.app.view.recipe.RecipeDetailedView;
import pjwstk.receipemate.app.view.recipe.RecipeView;
import pjwstk.receipemate.app.viewrepository.RecipeViewRepository;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/recipe")
public class RecipeController {
    private final RecipeViewRepository recipeViewRepository;

    public RecipeController(RecipeViewRepository recipeViewRepository) {
        this.recipeViewRepository = recipeViewRepository;
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
        return this.recipeViewRepository.get(id, pageable);
    }

    @GetMapping("/search")
    @ResponseBody
    public List<RecipeView> getByPhrase(@RequestParam String phrase) {
        return this.recipeViewRepository.getByPhrase(phrase);
    }
}
