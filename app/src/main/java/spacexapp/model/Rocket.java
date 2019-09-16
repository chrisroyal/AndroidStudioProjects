package spacexapp.model;

import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;

public class Rocket{

	@SerializedName("second_stage")
	private SecondStage secondStage;

	@SerializedName("rocket_id")
	private String rocketId;

	@SerializedName("first_stage")
	private FirstStage firstStage;

	@SerializedName("rocket_type")
	private String rocketType;

	@SerializedName("rocket_name")
	private String rocketName;

	@SerializedName("fairings")
	private Fairings fairings;

	public void setSecondStage(SecondStage secondStage){
		this.secondStage = secondStage;
	}

	public SecondStage getSecondStage(){
		return secondStage;
	}

	public void setRocketId(String rocketId){
		this.rocketId = rocketId;
	}

	public String getRocketId(){
		return rocketId;
	}

	public void setFirstStage(FirstStage firstStage){
		this.firstStage = firstStage;
	}

	public FirstStage getFirstStage(){
		return firstStage;
	}

	public void setRocketType(String rocketType){
		this.rocketType = rocketType;
	}

	public String getRocketType(){
		return rocketType;
	}

	public void setRocketName(String rocketName){
		this.rocketName = rocketName;
	}

	public String getRocketName(){
		return rocketName;
	}

	public void setFairings(Fairings fairings){
		this.fairings = fairings;
	}

	public Fairings getFairings(){
		return fairings;
	}

	@NotNull
	@Override
 	public String toString(){
		return 
			"Rocket{" + 
			"second_stage = '" + secondStage + '\'' + 
			",rocket_id = '" + rocketId + '\'' + 
			",first_stage = '" + firstStage + '\'' + 
			",rocket_type = '" + rocketType + '\'' + 
			",rocket_name = '" + rocketName + '\'' + 
			",fairings = '" + fairings + '\'' + 
			"}";
		}
}