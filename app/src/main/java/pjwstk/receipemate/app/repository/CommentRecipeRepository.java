package pjwstk.receipemate.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pjwstk.receipemate.app.model.CommentRecipe;

@Repository
public interface CommentRecipeRepository extends JpaRepository<CommentRecipe, Long> {
}
