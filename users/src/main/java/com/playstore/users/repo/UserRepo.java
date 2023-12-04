package com.playstore.users.repo;

import org.springframework.data.repository.CrudRepository;

import com.playstore.users.entity.Role;
import com.playstore.users.entity.User;

public interface UserRepo extends CrudRepository<User, String> {

}