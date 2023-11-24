package Projects.YourPlace_BackEnd_App.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import Projects.YourPlace_BackEnd_App.entities.Reservation;
import Projects.YourPlace_BackEnd_App.exceptions.NotFoundException;
import Projects.YourPlace_BackEnd_App.payloads.UpdateReservationPayload;
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
	public Reservation findReservation(UUID id) {
		Optional<Reservation> reservation = reservationRepository.findById(id);
		return reservation.orElseThrow(() -> new NotFoundException("Item with id " + id + " not found."));
	}

	// - - - - - - updateReservation - - - - - -
	public Reservation updateReservation(UUID id, UpdateReservationPayload payload) {
		Reservation reservation = findReservation(id);
		reservation.setDescription(payload.getDescription());
		return reservationRepository.save(reservation);
	}

	// - - - - - - deleteReservation - - - - - -
	public void deleteReservation(UUID id) {
		Reservation reservation = findReservation(id);
		reservationRepository.delete(reservation);
	}

}
