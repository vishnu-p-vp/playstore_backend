package com.playstore.users.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class AppEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer appId;
	String appName;
	String appDescription;
	String releaseDate;
	String categoryName;
	Integer appDownloads;
	Boolean appVisibility;
	String appImageUrl;
	


	public AppEntity(Integer appId, String appName, String appDescription, String releaseDate, String categoryName,
			Boolean appVisibility, String appImageUrl) {
		super();
		this.appId = appId;
		this.appName = appName;
		this.appDescription = appDescription;
		this.releaseDate = releaseDate;
		this.categoryName = categoryName;
		this.appVisibility = appVisibility;
		this.appImageUrl = appImageUrl;
	}


	public AppEntity(String appName, String appDescription, String releaseDate, String categoryName,
			Boolean appVisibility, String appImageUrl) {
		super();
		this.appName = appName;
		this.appDescription = appDescription;
		this.releaseDate = releaseDate;
		this.categoryName = categoryName;
		this.appVisibility = appVisibility;
		this.appImageUrl = appImageUrl;
	}


	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="app_id")
	private List<RatingEntity> ratingEntities;
	

	
	public String getAppImageUrl() {
		return appImageUrl;
	}


	public void setAppImageUrl(String appImageUrl) {
		this.appImageUrl = appImageUrl;
	}
	
	
	public AppEntity(String appName, String appDescription, String releaseDate, String categoryName,
			Boolean appVisibility) {
		super();
		this.appName = appName;
		this.appDescription = appDescription;
		this.releaseDate = releaseDate;
		this.categoryName = categoryName;
		this.appVisibility = appVisibility;
	}


	public AppEntity(Integer appId, String appName, String appDescription, String releaseDate, String categoryName,
			Boolean appVisibility) {
		super();
		this.appId = appId;
		this.appName = appName;
		this.appDescription = appDescription;
		this.releaseDate = releaseDate;
		this.categoryName = categoryName;
		this.appVisibility = appVisibility;
	}


	public AppEntity(Integer appId, String appName, String appDescription, String releaseDate, String categoryName,
			Integer appDownloads, Boolean appVisibility) {
		super();
		this.appId = appId;
		this.appName = appName;
		this.appDescription = appDescription;
		this.releaseDate = releaseDate;
		this.categoryName = categoryName;
		this.appDownloads = appDownloads;
		this.appVisibility = appVisibility;
	}


	
	
	
	
	
	@Override
	public String toString() {
		return "AppEntity [appId=" + appId + ", appName=" + appName + ", appDescription=" + appDescription
				+ ", releaseDate=" + releaseDate + ", categoryName=" + categoryName + ", appDownloads=" + appDownloads
				+ ", appVisibility=" + appVisibility + ", ratingEntities=" + ratingEntities + "]";
	}


	public AppEntity(Integer appId, String appName, String appDescription, String releaseDate, String categoryName,
			Integer appDownloads, Boolean appVisibility, List<RatingEntity> ratingEntities) {
		super();
		this.appId = appId;
		this.appName = appName;
		this.appDescription = appDescription;
		this.releaseDate = releaseDate;
		this.categoryName = categoryName;
		this.appDownloads = appDownloads;
		this.appVisibility = appVisibility;
		this.ratingEntities = ratingEntities;
	}


	public Integer getAppId() {
		return appId;
	}


	public void setAppId(Integer appId) {
		this.appId = appId;
	}


	public String getAppName() {
		return appName;
	}


	public void setAppName(String appName) {
		this.appName = appName;
	}


	public String getAppDescription() {
		return appDescription;
	}


	public void setAppDescription(String appDescription) {
		this.appDescription = appDescription;
	}


	public String getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public Integer getAppDownloads() {
		return appDownloads;
	}


	public void setAppDownloads(Integer appDownloads) {
		this.appDownloads = appDownloads;
	}


	public Boolean getAppVisibility() {
		return appVisibility;
	}


	public void setAppVisibility(Boolean appVisibility) {
		this.appVisibility = appVisibility;
	}


	public List<RatingEntity> getRatingEntities() {
		return ratingEntities;
	}


	public void setRatingEntities(List<RatingEntity> ratingEntities) {
		this.ratingEntities = ratingEntities;
	}


	public AppEntity() {
		super();
	}

}



//{
//    "appId":1,
//    "appName":"temple run",
//    "appDescription":"to play games",
//    "releaseDate":"3-10-2022",
//    "categoryName":"games",
//    "appDownloads":0,
//    "appVisibility":true,
//    "ratingEntities":[
//        {
//             "ratingId":1,
//        "stars":5,
//        "reviews":"good to play",
//        "appId":1
//        },
//         {
//             "ratingId":2,
//        "stars":5,
//        "reviews":"good to play",
//        "appId":1
//        }
//
//    ]
//       
//    
//}

