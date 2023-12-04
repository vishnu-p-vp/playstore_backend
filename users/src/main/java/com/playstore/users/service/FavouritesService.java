package com.playstore.users.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playstore.users.entity.Favourites;
import com.playstore.users.repo.FavouriteRepo;

import antlr.collections.List;

@Service
public class FavouritesService {
	@Autowired
	FavouriteRepo favRepo;
	
	public Favourites addFavourites(Favourites appName)
	{
		return favRepo.save(appName);
	}
	
	public Set<Favourites> showFavourites()
	{
		return (Set<Favourites>) favRepo.findAll();
	}
}
