package Projects.YourPlace_BackEnd_App.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Projects.YourPlace_BackEnd_App.entities.Reservation;
import Projects.YourPlace_BackEnd_App.services.ReservationService;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

	private final ReservationService reservationService;

	@Autowired
	public ReservationController(ReservationService reservationService) {
		this.reservationService = reservationService;
	}

	// - - - - - - createReservation - - - - - -
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Reservation createReservation(@RequestBody Reservation reservation) {
		return reservationService.createReservation(reservation);
	}

	// - - - - - - getReservations - - - - - -
	@GetMapping("/reservations")
	public Page<Reservation> getReservations() {
		return null;

	}

	// - - - - - - findReservation - - - - - -
	@GetMapping("/{id}")
	public Reservation findReservation() {
		return null;

	}

	// - - - - - - updateReservation - - - - - -
	@GetMapping("/{id}")
	public Reservation updateReservation() {
		return null;

	}

	// - - - - - - deleteReservation - - - - - -
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteReservation() {

	}

}
