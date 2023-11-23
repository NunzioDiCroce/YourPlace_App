package Projects.YourPlace_BackEnd_App.entities;

import java.util.UUID;

import Projects.YourPlace_BackEnd_App.enums.PlaceStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "places")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Place {
	@Id
	@GeneratedValue
	private UUID id;

	private String city;
	private String address;
	private int building;
	private int place;

	@Enumerated(EnumType.STRING)
	private PlaceStatus placeStatus;

	@ManyToOne
	private Reservation reservation;
}