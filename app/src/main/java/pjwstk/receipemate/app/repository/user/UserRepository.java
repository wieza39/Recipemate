package pjwstk.receipemate.app.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pjwstk.receipemate.app.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
