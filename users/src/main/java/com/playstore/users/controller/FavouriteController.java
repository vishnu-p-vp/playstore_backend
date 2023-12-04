package com.playstore.users.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.playstore.users.entity.Favourites;
import com.playstore.users.service.FavouritesService;

@RestController
@RequestMapping
public class FavouriteController {

	@Autowired
	FavouritesService favService;
	
	@PostMapping("/addFavourites")
	public ResponseEntity<Favourites> addFavourites(@RequestBody Favourites appName)
	{
		return new ResponseEntity<>(favService.addFavourites(appName),HttpStatus.CREATED);
	}
	
	@GetMapping("/getFavourites")
	public ResponseEntity<Set<Favourites>> showFavourites()
	{
		return new ResponseEntity<>(favService.showFavourites(),HttpStatus.OK);
	}
}
