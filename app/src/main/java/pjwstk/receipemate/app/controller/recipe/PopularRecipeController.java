package pjwstk.receipemate.app.controller.recipe;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pjwstk.receipemate.app.view.PageView;
import pjwstk.receipemate.app.viewrepository.PopularRecipeViewRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/recipe/popular")
public class PopularRecipeController {
    private final PopularRecipeViewRepository popularRecipeViewRepository;

    public PopularRecipeController(PopularRecipeViewRepository popularRecipeViewRepository) {
        this.popularRecipeViewRepository = popularRecipeViewRepository;
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<PageView> getPopularRecipes(
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "12") int limit
    ) {
        Pageable pageable = PageRequest.of(pageNumber, limit);
        return ResponseEntity.ok(popularRecipeViewRepository.getList(pageable));
    }
}
