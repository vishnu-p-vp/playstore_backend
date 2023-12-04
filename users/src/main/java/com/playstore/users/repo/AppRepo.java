package com.playstore.users.repo;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.playstore.users.entity.AppEntity;



public interface AppRepo extends CrudRepository<AppEntity, Integer>{

	List<AppEntity> findByCategoryName(String categoryName);

	Optional<AppEntity> findByAppName(String appName);
	
	AppEntity findByAppId(Integer appId);

}
