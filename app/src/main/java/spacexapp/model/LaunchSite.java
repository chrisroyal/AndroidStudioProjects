package spacexapp.model;

import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;

public class LaunchSite{

	@SerializedName("site_name")
	private String siteName;

	@SerializedName("site_id")
	private String siteId;

	@SerializedName("site_name_long")
	private String siteNameLong;

	public void setSiteName(String siteName){
		this.siteName = siteName;
	}

	public String getSiteName(){
		return siteName;
	}

	public void setSiteId(String siteId){
		this.siteId = siteId;
	}

	public String getSiteId(){
		return siteId;
	}

	public void setSiteNameLong(String siteNameLong){
		this.siteNameLong = siteNameLong;
	}

	public String getSiteNameLong(){
		return siteNameLong;
	}

	@NotNull
	@Override
 	public String toString(){
		return 
			"LaunchSite{" + 
			"site_name = '" + siteName + '\'' + 
			",site_id = '" + siteId + '\'' + 
			",site_name_long = '" + siteNameLong + '\'' + 
			"}";
		}
}