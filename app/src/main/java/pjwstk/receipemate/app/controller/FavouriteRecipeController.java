package pjwstk.receipemate.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pjwstk.receipemate.app.service.FavouriteRecipeService;

@RestController
@RequestMapping("/favourites")
public class FavouriteRecipeController {

    private final FavouriteRecipeService favouriteRecipeService;

    public FavouriteRecipeController(FavouriteRecipeService favouriteRecipeService) {
        this.favouriteRecipeService = favouriteRecipeService;
    }
}
