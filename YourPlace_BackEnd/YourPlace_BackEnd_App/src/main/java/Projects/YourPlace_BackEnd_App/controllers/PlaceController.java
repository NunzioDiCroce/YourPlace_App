package Projects.YourPlace_BackEnd_App.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Projects.YourPlace_BackEnd_App.entities.Place;
import Projects.YourPlace_BackEnd_App.payloads.UpdatePlacePayload;
import Projects.YourPlace_BackEnd_App.services.PlaceService;

@RestController
@RequestMapping("/places")
public class PlaceController {

	private final PlaceService placeService;

	@Autowired
	public PlaceController(PlaceService placeService) {
		this.placeService = placeService;
	}

	// - - - - - - createPlace - - - - - -
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Place createPlace(@RequestBody Place place) {
		return placeService.createPlace(place);
	}

	// - - - - - - getPlaces - - - - - -
	@GetMapping("/places")
	public Page<Place> getPlaces(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "10") int size, @RequestParam(defaultValue = "placeId") String sort) {
		return placeService.getPlaces(page, size, sort);
	}

	// - - - - - - findPlace - - - - - -
	@GetMapping("/{id}")
	public Place findPlace(@PathVariable UUID id) {
		return placeService.findPlace(id);
	}

	// - - - - - - updatePlace - - - - - -
	@PutMapping("/{id}")
	public Place updatePlace(@PathVariable UUID id, @RequestBody UpdatePlacePayload payload) {
		return placeService.updatePlace(id, payload);
	}

	// - - - - - - deletePlace - - - - - -
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletePlace(@PathVariable UUID id) {
		placeService.deletePlace(id);
	}

}
