package pjwstk.receipemate.app.service;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.repository.RecipeRepository;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
}
