package Projects.YourPlace_BackEnd_App.payloads;

import Projects.YourPlace_BackEnd_App.enums.PlaceStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdatePlacePayload {

	private String city;
	private String address;
	private int building;
	private int place;

	@Enumerated(EnumType.STRING)
	private PlaceStatus placeStatus;

}
