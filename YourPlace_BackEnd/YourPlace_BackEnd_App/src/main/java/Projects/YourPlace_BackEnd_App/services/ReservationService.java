package Projects.YourPlace_BackEnd_App.services;

import java.util.Optional;
import java.util.UUID;

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
	public Reservation createReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

	// - - - - - - getReservations - - - - - -
	public Page<Reservation> getReservations() {
		return null;

	}

	// - - - - - - findReservation - - - - - -
	public Optional<Reservation> findReservation(UUID id) {
		return reservationRepository.findById(id);
	}

	// - - - - - - updateReservation - - - - - -
	public Reservation updateReservation() {
		return null;

	}

	// - - - - - - deleteReservation - - - - - -
	public void deleteReservation(UUID id) {
		reservationRepository.deleteById(id);
	}

}
