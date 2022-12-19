package ma.weboven.skyup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.weboven.skyup.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long>{
    UserModel findByUsername(String username);
    
}
