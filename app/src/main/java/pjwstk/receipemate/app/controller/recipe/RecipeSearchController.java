package pjwstk.receipemate.app.controller.recipe;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import pjwstk.receipemate.app.view.PageView;
import pjwstk.receipemate.app.viewrepository.recipe.RecipeViewRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/recipe/search")
public class RecipeSearchController {
    private final RecipeViewRepository recipeViewRepository;

    public RecipeSearchController(RecipeViewRepository recipeViewRepository) {
        this.recipeViewRepository = recipeViewRepository;
    }

    @GetMapping
    @ResponseBody
    public PageView getByPhrase(
            @RequestParam String phrase,
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "12") int limit
    ) {
        Pageable pageable = PageRequest.of(pageNumber, limit);
        return this.recipeViewRepository.getByPhrase(phrase, pageable);
    }
}
