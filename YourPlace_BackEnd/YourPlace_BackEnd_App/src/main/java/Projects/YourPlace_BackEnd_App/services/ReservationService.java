package Projects.YourPlace_BackEnd_App.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import Projects.YourPlace_BackEnd_App.entities.Reservation;
import Projects.YourPlace_BackEnd_App.repositories.ReservationRepository;

@Service
public class ReservationService {

	private final ReservationRepository reservationRepository;

	@Autowired
	public ReservationService(ReservationRepository reservationRepository) {
		this.reservationRepository = reservationRepository;
	}

	// - - - - - - createReservation - - - - - -
	public Reservation createReservation() {
		return null;

	}

	// - - - - - - getReservations - - - - - -
	public Page<Reservation> getReservations() {
		return null;

	}

	// - - - - - - findReservation - - - - - -
	public Reservation findReservation() {
		return null;

	}

	// - - - - - - updateReservation - - - - - -
	public Reservation updateReservation() {
		return null;

	}

	// - - - - - - deleteReservation - - - - - -
	public void deleteReservation() {

	}

}
