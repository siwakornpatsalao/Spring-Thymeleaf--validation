package th.ac.ku.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.ac.ku.restaurant.model.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    User findByUsername(String name);
}
