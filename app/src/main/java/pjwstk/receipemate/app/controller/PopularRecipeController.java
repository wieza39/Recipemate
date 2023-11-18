package pjwstk.receipemate.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pjwstk.receipemate.app.view.PopularRepositoryView;
import pjwstk.receipemate.app.viewRepository.PopularRecipeViewRepository;

import java.util.List;

@RestController
@RequestMapping("/recipe/popular")
public class PopularRecipeController {
    private final PopularRecipeViewRepository popularRecipeViewRepository;

    public PopularRecipeController(PopularRecipeViewRepository popularRecipeViewRepository) {
        this.popularRecipeViewRepository = popularRecipeViewRepository;
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<PopularRepositoryView>> getPopularRecipes(@RequestParam(defaultValue = "12") int limit) {
        return ResponseEntity.ok(popularRecipeViewRepository.getList(limit));
    }
}
