package pjwstk.receipemate.app.repository.ingredient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pjwstk.receipemate.app.entity.Ingredient;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
