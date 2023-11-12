package pjwstk.receipemate.app.service;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.repository.RecipeIngredientRepository;

@Service
public class RecipeIgredientService {

    private final RecipeIngredientRepository recipeIngredientRepository;

    public RecipeIgredientService(RecipeIngredientRepository recipeIngredientRepository) {
        this.recipeIngredientRepository = recipeIngredientRepository;
    }
}
