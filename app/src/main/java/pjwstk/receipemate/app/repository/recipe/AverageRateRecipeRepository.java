package pjwstk.receipemate.app.repository.recipe;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pjwstk.receipemate.app.entity.Category;
import pjwstk.receipemate.app.entity.Recipe;
import pjwstk.receipemate.app.model.AverageRateRecipe;

import org.springframework.data.domain.Pageable;

@Repository
public interface AverageRateRecipeRepository extends JpaRepository<Recipe, Long> {
    @Query(value = "SELECT new pjwstk.receipemate.app.model.AverageRateRecipe(r, AVG(rr.value)) " +
            "FROM Recipe r " +
            "LEFT JOIN RateRecipe rr ON rr.recipe = r " +
            "GROUP BY r.id " +
            "ORDER BY AVG(rr.value) DESC, r.id")
    Page<AverageRateRecipe> getPopular(Pageable pageable);

    @Query(value = "SELECT new pjwstk.receipemate.app.model.AverageRateRecipe(r, AVG(rr.value)) " +
            "FROM Recipe r " +
            "LEFT JOIN RateRecipe rr ON rr.recipe = r " +
            "WHERE r.id = :id " +
            "GROUP BY r.id " +
            "ORDER BY AVG(rr.value) DESC, r.id")
    AverageRateRecipe findById(@Param(value = "id") long id);

    @Query(value = "SELECT new pjwstk.receipemate.app.model.AverageRateRecipe(r, AVG(rr.value)) " +
            "FROM Recipe r " +
            "LEFT JOIN RateRecipe rr ON rr.recipe = r " +
            "WHERE r.category = :category " +
            "GROUP BY r.id " +
            "ORDER BY AVG(rr.value) DESC, r.id")
    Page<AverageRateRecipe> getByCategoryId(
            Pageable pageable,
            @Param(value = "category") Category category
    );

    @Query(value = "SELECT new pjwstk.receipemate.app.model.AverageRateRecipe(r, AVG(rr.value)) " +
            "FROM Recipe r " +
            "LEFT JOIN RateRecipe rr ON rr.recipe = r " +
            "WHERE r.category = :#{#recipe.category} AND r != :recipe " +
            "GROUP BY r.id " +
            "ORDER BY AVG(rr.value) DESC, r.id")
    Page<AverageRateRecipe> getRelated(
            @Param(value = "recipe") Recipe recipe,
            Pageable pageable
    );

    @Query(value = "SELECT new pjwstk.receipemate.app.model.AverageRateRecipe(r, AVG(rr.value)) " +
            "FROM Recipe r " +
            "LEFT JOIN RateRecipe rr ON rr.recipe = r " +
            "LEFT JOIN RecipeIngredient ri ON ri.recipe = r " +
            "LEFT JOIN Ingredient i ON i = ri.ingredient " +
            "WHERE r.name LIKE %:phrase% " +
            "OR r.description like %:phrase% " +
            "OR i.name like %:phrase% " +
            "GROUP BY r.id " +
            "ORDER BY AVG(rr.value) DESC, r.id")
    Page<AverageRateRecipe> getByPhrase(
            @Param(value = "phrase") String phrase,
            Pageable pageable
    );
}
