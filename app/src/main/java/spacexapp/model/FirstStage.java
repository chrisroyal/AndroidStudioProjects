package spacexapp.model;


import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class FirstStage{

	@SerializedName("cores")
	private List<CoresItem> cores;

	public void setCores(List<CoresItem> cores){
		this.cores = cores;
	}

	public List<CoresItem> getCores(){
		return cores;
	}

	@NotNull
	@Override
 	public String toString(){
		return 
			"FirstStage{" + 
			"cores = '" + cores + '\'' + 
			"}";
		}
}