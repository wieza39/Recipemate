package pjwstk.receipemate.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pjwstk.receipemate.app.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}