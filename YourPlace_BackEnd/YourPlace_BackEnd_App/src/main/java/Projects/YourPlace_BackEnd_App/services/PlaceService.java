package Projects.YourPlace_BackEnd_App.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import Projects.YourPlace_BackEnd_App.entities.Place;
import Projects.YourPlace_BackEnd_App.repositories.PlaceRepository;

@Service
public class PlaceService {

	private final PlaceRepository placeRepository;

	@Autowired
	public PlaceService(PlaceRepository placeRepository) {
		this.placeRepository = placeRepository;
	}

	// - - - - - - createPlace - - - - - -
	public Place createPlace(Place place) {
		return placeRepository.save(place);
	}

	// - - - - - - getPlaces - - - - - -
	public Page<Place> getPlaces() {
		return null;

	}

	// - - - - - - findPlace - - - - - -
	public Optional<Place> findPlace(UUID id) {
		return placeRepository.findById(id);
	}

	// - - - - - - updatePlace - - - - - -
	public Place updatePlace() {
		return null;

	}

	// - - - - - - deletePlace - - - - - -
	public void deletePlace(UUID id) {
		placeRepository.deleteById(id);
	}

}
