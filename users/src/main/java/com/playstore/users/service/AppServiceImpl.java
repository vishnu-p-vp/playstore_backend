package com.playstore.users.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playstore.users.Exceptions.AppCannotBeDeletedException;
import com.playstore.users.Exceptions.AppNotFoundException;
import com.playstore.users.entity.AppEntity;
import com.playstore.users.entity.RatingEntity;
import com.playstore.users.repo.AppRepo;


@Service
public class AppServiceImpl 
//implements AppService 
{

	@Autowired
	AppRepo repo;

//	@Override
	public List<AppEntity> getAllApps() {
		return (List<AppEntity>) repo.findAll();
	}

//	@Override
	public AppEntity getAppByAppName(String appName) throws AppNotFoundException {
		Optional<AppEntity> opApp = repo.findByAppName(appName);
		AppEntity app = opApp.orElseThrow(() -> new AppNotFoundException());
		return app;
	}

//	@Override
	public List<AppEntity> getAppsByCategory(String categoryName) {
		List<AppEntity> appList1 = (List<AppEntity>) repo.findByCategoryName(categoryName);
		return appList1;
	}

//	@Override
	public RatingEntity addRating(RatingEntity ratingEntities) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
	public RatingEntity getRatingByAppId(Integer appId) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
	public AppEntity addApp(AppEntity app) {
		return repo.save(app);
	}

//	@Override
	public void deleteApp(String appName) throws AppCannotBeDeletedException {
		Optional<AppEntity> c = null;
		c = repo.findByAppName(appName);
		AppEntity course = c.orElseThrow(() -> new AppCannotBeDeletedException());
		repo.delete(course);
		
	}
	

}
