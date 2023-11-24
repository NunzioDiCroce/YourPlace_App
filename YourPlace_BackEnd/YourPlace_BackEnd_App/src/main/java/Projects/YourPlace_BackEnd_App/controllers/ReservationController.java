package Projects.YourPlace_BackEnd_App.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Projects.YourPlace_BackEnd_App.entities.Reservation;
import Projects.YourPlace_BackEnd_App.payloads.UpdateReservationPayload;
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
	public Page<Reservation> getReservations(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "10") int size, @RequestParam(defaultValue = "reservationId") String sort) {
		return reservationService.getReservations(page, size, sort);
	}

	// - - - - - - findReservation - - - - - -
	@GetMapping("/{id}")
	public Reservation findReservation(@PathVariable UUID id) {
		return reservationService.findReservation(id);
	}

	// - - - - - - updateReservation - - - - - -
	@GetMapping("/{id}")
	public Reservation updateReservation(@PathVariable UUID id, @RequestBody UpdateReservationPayload payload) {
		return reservationService.updateReservation(id, payload);
	}

	// - - - - - - deleteReservation - - - - - -
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteReservation(@PathVariable UUID id) {
		reservationService.deleteReservation(id);
	}

}
