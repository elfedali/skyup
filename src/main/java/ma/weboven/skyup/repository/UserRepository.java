package ma.weboven.skyup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.weboven.skyup.model.User;

/*
 * User Repository Interface, extends JpaRepository
 * It's used to access the database
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findByEmail(String email);
    
}
