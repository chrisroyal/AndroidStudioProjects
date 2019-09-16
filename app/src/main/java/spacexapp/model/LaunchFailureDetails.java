package spacexapp.model;

import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;

public class LaunchFailureDetails{

	@SerializedName("altitude")
	private Object altitude;

	@SerializedName("reason")
	private String reason;

	@SerializedName("time")
	private int time;

	public void setAltitude(Object altitude){
		this.altitude = altitude;
	}

	public Object getAltitude(){
		return altitude;
	}

	public void setReason(String reason){
		this.reason = reason;
	}

	public String getReason(){
		return reason;
	}

	public void setTime(int time){
		this.time = time;
	}

	public int getTime(){
		return time;
	}

	@NotNull
	@Override
 	public String toString(){
		return 
			"LaunchFailureDetails{" + 
			"altitude = '" + altitude + '\'' + 
			",reason = '" + reason + '\'' + 
			",time = '" + time + '\'' + 
			"}";
		}
}