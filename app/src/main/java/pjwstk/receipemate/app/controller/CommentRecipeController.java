package pjwstk.receipemate.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pjwstk.receipemate.app.service.CommentRecipeService;

@RestController
@RequestMapping("/comment")
public class CommentRecipeController {

    private final CommentRecipeService commentRecipeService;

    public CommentRecipeController(CommentRecipeService commentRecipeService) {
        this.commentRecipeService = commentRecipeService;
    }
}
