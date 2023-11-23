package Projects.YourPlace_BackEnd_App.entities;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reservations")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Reservation {
	@Id
	@GeneratedValue
	private UUID id;

	private Date start;
	private Date end;

	@ManyToOne
	private User user;

	@OneToMany(mappedBy = "reservation")
	private List<Place> places;
}
