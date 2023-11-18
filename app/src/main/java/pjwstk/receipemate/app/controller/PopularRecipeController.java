package pjwstk.receipemate.app.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pjwstk.receipemate.app.view.PopularRecipeRepositoryView;
import pjwstk.receipemate.app.viewRepository.PopularRecipeViewRepository;

@RestController
@RequestMapping("/recipe/popular")
public class PopularRecipeController {
    private final PopularRecipeViewRepository popularRecipeViewRepository;

    public PopularRecipeController(PopularRecipeViewRepository popularRecipeViewRepository) {
        this.popularRecipeViewRepository = popularRecipeViewRepository;
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<PopularRecipeRepositoryView> getPopularRecipes(@PageableDefault(value = 2, page = 0) Pageable pageable) {
        return ResponseEntity.ok(popularRecipeViewRepository.getList(pageable));
    }
}
