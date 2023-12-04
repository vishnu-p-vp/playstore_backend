package com.playstore.users.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.playstore.users.entity.Role;
import com.playstore.users.entity.User;
import com.playstore.users.repo.RoleRepo;
import com.playstore.users.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RoleRepo roleRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void initRoleAndUser() {

        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin role");
        roleRepo.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("Default role for newly created record");
        roleRepo.save(userRole);

        User adminUser = new User();
        adminUser.setUserName("admin123");
        adminUser.setUserPassword(
        		getEncodedPassword(
        				"admin@pass"
        				)
        		);
        adminUser.setUserFirstName("admin");
        adminUser.setUserLastName("admin");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        userRepo.save(adminUser);

//        User user = new User();
//        user.setUserName("raj123");
//        user.setUserPassword(
//        		getEncodedPassword(
//        				"raj@123"
//        				)
//        		);
//        user.setUserFirstName("raj");
//        user.setUserLastName("sharma");
//        Set<Role> userRoles = new HashSet<>();
//        userRoles.add(userRole);
//        user.setRole(userRoles);
//        userRepo.save(user);
    }

    public User registerNewUser(User user) {
        Role role = roleRepo.findById("User").get();
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(role);
        user.setRole(userRoles);
        user.setUserPassword(
        		getEncodedPassword(
        				user.getUserPassword()
        				)
        		);

        return userRepo.save(user); 
    }

    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }
}
