//package com.playstore.users.service;
//
//import java.util.List;
//
//import com.playstore.users.Exceptions.AppCannotBeDeletedException;
//import com.playstore.users.Exceptions.AppNotFoundException;
//import com.playstore.users.entity.AppEntity;
//import com.playstore.users.entity.RatingEntity;
//
//public interface AppService {
//	
//	//user
//	public List<AppEntity> getAllApps(); 
//	public AppEntity getAppByAppName(String appName) throws AppNotFoundException;
//	public List<AppEntity> getAppsByCategory(String categoryName);
//	public RatingEntity addRating(RatingEntity ratingEntities); 
//	public RatingEntity getRatingByAppId(Integer appId);
//	
//	
//	//owner
//	public AppEntity addApp(AppEntity app);
//	//public AppEntity updateApp(String appName,AppEntity newApp);
//	public void deleteApp(String appName) throws AppCannotBeDeletedException; 
//	 
//}
