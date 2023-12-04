package com.playstore.users.repo;

import org.springframework.data.repository.CrudRepository;

import com.playstore.users.entity.Favourites;

public interface FavouriteRepo extends CrudRepository<Favourites,String>{

}
