package spacexapp.model;

import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;

public class Timeline{

	@SerializedName("webcast_liftoff")
	private int webcastLiftoff;

	public void setWebcastLiftoff(int webcastLiftoff){
		this.webcastLiftoff = webcastLiftoff;
	}

	public int getWebcastLiftoff(){
		return webcastLiftoff;
	}

	@NotNull
	@Override
 	public String toString(){
		return 
			"Timeline{" + 
			"webcast_liftoff = '" + webcastLiftoff + '\'' + 
			"}";
		}
}