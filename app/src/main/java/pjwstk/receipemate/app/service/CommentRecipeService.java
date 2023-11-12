package pjwstk.receipemate.app.service;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.model.CommentRecipe;
import pjwstk.receipemate.app.repository.CommentRecipeRepository;

@Service
public class CommentRecipeService {

    private final CommentRecipeRepository commentRecipeRepository;

    public CommentRecipeService(CommentRecipeRepository commentRecipeRepository) {
        this.commentRecipeRepository = commentRecipeRepository;
    }
}
