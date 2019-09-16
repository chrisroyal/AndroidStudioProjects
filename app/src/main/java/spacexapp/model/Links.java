package spacexapp.model;

import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Links{

	@SerializedName("mission_patch_small")
	private String missionPatchSmall;

	@SerializedName("mission_patch")
	private String missionPatch;

	@SerializedName("video_link")
	private String videoLink;

	@SerializedName("flickr_images")
	private List<Object> flickrImages;

	@SerializedName("reddit_recovery")
	private Object redditRecovery;

	@SerializedName("reddit_media")
	private Object redditMedia;

	@SerializedName("reddit_campaign")
	private Object redditCampaign;

	@SerializedName("wikipedia")
	private String wikipedia;

	@SerializedName("reddit_launch")
	private Object redditLaunch;

	@SerializedName("youtube_id")
	private String youtubeId;

	@SerializedName("presskit")
	private Object presskit;

	@SerializedName("article_link")
	private String articleLink;

	public void setMissionPatchSmall(String missionPatchSmall){
		this.missionPatchSmall = missionPatchSmall;
	}

	public String getMissionPatchSmall(){
		return missionPatchSmall;
	}

	public void setMissionPatch(String missionPatch){
		this.missionPatch = missionPatch;
	}

	public String getMissionPatch(){
		return missionPatch;
	}

	public void setVideoLink(String videoLink){
		this.videoLink = videoLink;
	}

	public String getVideoLink(){
		return videoLink;
	}

	public void setFlickrImages(List<Object> flickrImages){
		this.flickrImages = flickrImages;
	}

	public List<Object> getFlickrImages(){
		return flickrImages;
	}

	public void setRedditRecovery(Object redditRecovery){
		this.redditRecovery = redditRecovery;
	}

	public Object getRedditRecovery(){
		return redditRecovery;
	}

	public void setRedditMedia(Object redditMedia){
		this.redditMedia = redditMedia;
	}

	public Object getRedditMedia(){
		return redditMedia;
	}

	public void setRedditCampaign(Object redditCampaign){
		this.redditCampaign = redditCampaign;
	}

	public Object getRedditCampaign(){
		return redditCampaign;
	}

	public void setWikipedia(String wikipedia){
		this.wikipedia = wikipedia;
	}

	public String getWikipedia(){
		return wikipedia;
	}

	public void setRedditLaunch(Object redditLaunch){
		this.redditLaunch = redditLaunch;
	}

	public Object getRedditLaunch(){
		return redditLaunch;
	}

	public void setYoutubeId(String youtubeId){
		this.youtubeId = youtubeId;
	}

	public String getYoutubeId(){
		return youtubeId;
	}

	public void setPresskit(Object presskit){
		this.presskit = presskit;
	}

	public Object getPresskit(){
		return presskit;
	}

	public void setArticleLink(String articleLink){
		this.articleLink = articleLink;
	}

	public String getArticleLink(){
		return articleLink;
	}

	@NotNull
	@Override
 	public String toString(){
		return 
			"Links{" + 
			"mission_patch_small = '" + missionPatchSmall + '\'' + 
			",mission_patch = '" + missionPatch + '\'' + 
			",video_link = '" + videoLink + '\'' + 
			",flickr_images = '" + flickrImages + '\'' + 
			",reddit_recovery = '" + redditRecovery + '\'' + 
			",reddit_media = '" + redditMedia + '\'' + 
			",reddit_campaign = '" + redditCampaign + '\'' + 
			",wikipedia = '" + wikipedia + '\'' + 
			",reddit_launch = '" + redditLaunch + '\'' + 
			",youtube_id = '" + youtubeId + '\'' + 
			",presskit = '" + presskit + '\'' + 
			",article_link = '" + articleLink + '\'' + 
			"}";
		}
}