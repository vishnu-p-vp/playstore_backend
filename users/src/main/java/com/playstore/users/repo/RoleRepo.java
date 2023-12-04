package com.playstore.users.repo;

import org.springframework.data.repository.CrudRepository;

import com.playstore.users.entity.Role;

public interface RoleRepo extends CrudRepository<Role, String> {

}
