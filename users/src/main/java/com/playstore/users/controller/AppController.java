package com.playstore.users.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.playstore.users.Exceptions.AppCannotBeDeletedException;
import com.playstore.users.Exceptions.AppNotFoundException;
import com.playstore.users.entity.AppEntity;
import com.playstore.users.service.AppServiceImpl;

@RestController
@RequestMapping
public class AppController {
	
	@Autowired
	AppServiceImpl service;
	
	@GetMapping("/all")//localhost:9091/all
	public ResponseEntity<List<AppEntity>> getAllApps() {
		List<AppEntity> applist= service.getAllApps();
		return new ResponseEntity<>(applist,HttpStatus.OK);
	}
	
	@GetMapping(value="/findApp/{appName}")//localhost:9091/findApp/temple run
	public ResponseEntity<AppEntity> getAppByAppName(
//			@RequestParam("appName") 
			@PathVariable String appName ) throws AppNotFoundException
	{	
		AppEntity app1=service.getAppByAppName(appName);
		return new ResponseEntity<>(app1,HttpStatus.OK);
	}
	
	
	@GetMapping(value="/category/{categoryName}")//localhost:9091/category?categoryName=beauty
	public ResponseEntity<List<AppEntity>> getAppsByCategory(
//			@RequestParam("categoryName") 
			@PathVariable 
			String categoryName ) 
	{
		List<AppEntity> applist= service.getAppsByCategory(categoryName);
		return new ResponseEntity<>(applist,HttpStatus.OK);
	}
	
	
	//Owner
	 
	@PostMapping(value="/addApp")//localhost:9091/addApp
//	@PreAuthorize("hasRole('Admin')")
	public ResponseEntity<AppEntity> addApp(@RequestBody AppEntity ae) 
	{
		AppEntity app1 =service.addApp(ae);
		return new ResponseEntity<>(app1,HttpStatus.CREATED);
	}

//	@PutMapping(value="/update/app")//localhost:9091/update/app?appName=temple run
//	public AppEntity updateApp(@RequestParam("appName") String appName,@RequestBody AppEntity app)
//	{
//		return service.updateApp(appName, app);
//	}
	
	@DeleteMapping(value="/deleteApp")//localhost:9091/deleteApp?appName=temple run
	public ResponseEntity<String> deleteApp(
			@RequestParam("appName") 
			String appName) throws AppCannotBeDeletedException
	{
		service.deleteApp(appName);
		return new ResponseEntity<>("app is deleted successfully",HttpStatus.OK);
	}
	

	
}
