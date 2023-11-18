package pjwstk.receipemate.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pjwstk.receipemate.app.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
