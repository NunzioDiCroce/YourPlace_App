package Projects.YourPlace_BackEnd_App.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import Projects.YourPlace_BackEnd_App.entities.Place;
import Projects.YourPlace_BackEnd_App.exceptions.NotFoundException;
import Projects.YourPlace_BackEnd_App.payloads.UpdatePlacePayload;
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
	public Page<Place> getPlaces(int page, int size, String sort) {
		return placeRepository.findAll(PageRequest.of(page, size, Sort.by(sort)));
	}

	// - - - - - - findPlace - - - - - -
	public Place findPlace(UUID id) {
		Optional<Place> place = placeRepository.findById(id);
		return place.orElseThrow(() -> new NotFoundException("Item with id " + id + " not found."));
	}

	// - - - - - - updatePlace - - - - - -
	public Place updatePlace(UUID id, UpdatePlacePayload payload) {
		Place place = findPlace(id);
		place.setCity(payload.getCity());
		place.setAddress(payload.getAddress());
		place.setBuilding(payload.getBuilding());
		place.setPlace(payload.getPlace());
		place.setPlaceStatus(payload.getPlaceStatus());
		return placeRepository.save(place);
	}

	// - - - - - - deletePlace - - - - - -
	public void deletePlace(UUID id) {
		Place place = findPlace(id);
		placeRepository.delete(place);
	}

}
