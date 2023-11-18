package pjwstk.receipemate.app.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pjwstk.receipemate.app.entity.Recipe;
import pjwstk.receipemate.app.model.AverageRateRecipe;

import org.springframework.data.domain.Pageable;

@Repository
public interface AverageRateRecipeRepository extends JpaRepository<Recipe, Long> {
    @Query(value = "SELECT new pjwstk.receipemate.app.model.AverageRateRecipe(r, AVG(rr.value)) " +
            "FROM Recipe r " +
            "LEFT JOIN RateRecipe rr ON rr.recipe = r " +
            "GROUP BY r.id ORDER BY AVG(rr.value) DESC, r.id")
    Page<AverageRateRecipe> getAll(Pageable pageable);
}
