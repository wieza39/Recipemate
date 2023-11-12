package pjwstk.receipemate.app.service;


import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.repository.RateRecipeRepository;

@Service
public class RateRecipeService {

    private final RateRecipeRepository rateRecipeRepository;

    public RateRecipeService(RateRecipeRepository rateRecipeRepository) {
        this.rateRecipeRepository = rateRecipeRepository;
    }
}
