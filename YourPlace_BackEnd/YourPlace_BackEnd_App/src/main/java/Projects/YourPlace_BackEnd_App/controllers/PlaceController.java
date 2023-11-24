package Projects.YourPlace_BackEnd_App.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Projects.YourPlace_BackEnd_App.entities.Place;
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
	public Place createPlace() {
		return null;

	}

	// - - - - - - getPlaces - - - - - -
	@GetMapping("/places")
	public Page<Place> getPlaces() {
		return null;

	}

	// - - - - - - findPlace - - - - - -
	@GetMapping("/{id}")
	public Place findPlace() {
		return null;

	}

	// - - - - - - updatePlace - - - - - -
	@PutMapping("/{id}")
	public Place updatePlace() {
		return null;

	}

	// - - - - - - deletePlace - - - - - -
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletePlace() {

	}

}
