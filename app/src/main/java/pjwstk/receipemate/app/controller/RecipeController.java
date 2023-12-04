package pjwstk.receipemate.app.controller;

import org.springframework.web.bind.annotation.*;
import pjwstk.receipemate.app.view.RecipeView;
import pjwstk.receipemate.app.viewrepository.RecipeViewRepository;

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
    public RecipeView find(@PathVariable(value = "id") long id) {
        return this.recipeViewRepository.get(id);
    }
}
