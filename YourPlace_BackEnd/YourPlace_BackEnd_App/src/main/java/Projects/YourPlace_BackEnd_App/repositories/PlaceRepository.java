package Projects.YourPlace_BackEnd_App.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Projects.YourPlace_BackEnd_App.entities.Place;

@Repository
public interface PlaceRepository extends JpaRepository<Place, UUID> {

}
