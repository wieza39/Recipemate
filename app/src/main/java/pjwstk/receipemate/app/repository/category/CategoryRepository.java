package pjwstk.receipemate.app.repository.category;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pjwstk.receipemate.app.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query(value = "SELECT DISTINCT c FROM Category c JOIN FETCH c.recipes")
    Page<Category> getWithRecipes(Pageable pageable);
}
