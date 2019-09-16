package spacexapp.model;

import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;

public class Telemetry{

	@SerializedName("flight_club")
	private Object flightClub;

	public void setFlightClub(Object flightClub){
		this.flightClub = flightClub;
	}

	public Object getFlightClub(){
		return flightClub;
	}

	@NotNull
	@Override
 	public String toString(){
		return 
			"Telemetry{" + 
			"flight_club = '" + flightClub + '\'' + 
			"}";
		}
}