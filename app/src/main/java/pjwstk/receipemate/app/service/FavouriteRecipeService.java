package pjwstk.receipemate.app.service;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.repository.FavouriteRecipeRepository;

@Service
public class FavouriteRecipeService {

    private final FavouriteRecipeRepository favouriteRecipeRepository;

    public FavouriteRecipeService(FavouriteRecipeRepository favouriteRecipeRepository) {
        this.favouriteRecipeRepository = favouriteRecipeRepository;
    }
}
