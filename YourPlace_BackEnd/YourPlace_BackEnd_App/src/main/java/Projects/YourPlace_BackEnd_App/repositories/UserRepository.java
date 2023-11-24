package Projects.YourPlace_BackEnd_App.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Projects.YourPlace_BackEnd_App.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
