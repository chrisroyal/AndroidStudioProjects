package spacexapp.model;


import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;

public class CoresItem{

	@SerializedName("flight")
	private int flight;

	@SerializedName("landing_type")
	private Object landingType;

	@SerializedName("gridfins")
	private boolean gridfins;

	@SerializedName("landing_intent")
	private boolean landingIntent;

	@SerializedName("legs")
	private boolean legs;

	@SerializedName("land_success")
	private Object landSuccess;

	@SerializedName("landing_vehicle")
	private Object landingVehicle;

	@SerializedName("block")
	private Object block;

	@SerializedName("reused")
	private boolean reused;

	@SerializedName("core_serial")
	private String coreSerial;

	public void setFlight(int flight){
		this.flight = flight;
	}

	public int getFlight(){
		return flight;
	}

	public void setLandingType(Object landingType){
		this.landingType = landingType;
	}

	public Object getLandingType(){
		return landingType;
	}

	public void setGridfins(boolean gridfins){
		this.gridfins = gridfins;
	}

	public boolean isGridfins(){
		return gridfins;
	}

	public void setLandingIntent(boolean landingIntent){
		this.landingIntent = landingIntent;
	}

	public boolean isLandingIntent(){
		return landingIntent;
	}

	public void setLegs(boolean legs){
		this.legs = legs;
	}

	public boolean isLegs(){
		return legs;
	}

	public void setLandSuccess(Object landSuccess){
		this.landSuccess = landSuccess;
	}

	public Object getLandSuccess(){
		return landSuccess;
	}

	public void setLandingVehicle(Object landingVehicle){
		this.landingVehicle = landingVehicle;
	}

	public Object getLandingVehicle(){
		return landingVehicle;
	}

	public void setBlock(Object block){
		this.block = block;
	}

	public Object getBlock(){
		return block;
	}

	public void setReused(boolean reused){
		this.reused = reused;
	}

	public boolean isReused(){
		return reused;
	}

	public void setCoreSerial(String coreSerial){
		this.coreSerial = coreSerial;
	}

	public String getCoreSerial(){
		return coreSerial;
	}

	@NotNull
	@Override
 	public String toString(){
		return 
			"CoresItem{" + 
			"flight = '" + flight + '\'' + 
			",landing_type = '" + landingType + '\'' + 
			",gridfins = '" + gridfins + '\'' + 
			",landing_intent = '" + landingIntent + '\'' + 
			",legs = '" + legs + '\'' + 
			",land_success = '" + landSuccess + '\'' + 
			",landing_vehicle = '" + landingVehicle + '\'' + 
			",block = '" + block + '\'' + 
			",reused = '" + reused + '\'' + 
			",core_serial = '" + coreSerial + '\'' + 
			"}";
		}
}