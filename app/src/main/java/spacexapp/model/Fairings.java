package spacexapp.model;

import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;

public class Fairings{

	@SerializedName("recovered")
	private boolean recovered;

	@SerializedName("recovery_attempt")
	private boolean recoveryAttempt;

	@SerializedName("ship")
	private Object ship;

	@SerializedName("reused")
	private boolean reused;

	public void setRecovered(boolean recovered){
		this.recovered = recovered;
	}

	public boolean isRecovered(){
		return recovered;
	}

	public void setRecoveryAttempt(boolean recoveryAttempt){
		this.recoveryAttempt = recoveryAttempt;
	}

	public boolean isRecoveryAttempt(){
		return recoveryAttempt;
	}

	public void setShip(Object ship){
		this.ship = ship;
	}

	public Object getShip(){
		return ship;
	}

	public void setReused(boolean reused){
		this.reused = reused;
	}

	public boolean isReused(){
		return reused;
	}

	@NotNull
	@Override
 	public String toString(){
		return 
			"Fairings{" + 
			"recovered = '" + recovered + '\'' + 
			",recovery_attempt = '" + recoveryAttempt + '\'' + 
			",ship = '" + ship + '\'' + 
			",reused = '" + reused + '\'' + 
			"}";
		}
}