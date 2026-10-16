package com.UserService.service;

import com.UserService.entity.User;

import  java.util.List;
public interface UserService {
    //create
    User save(User user);

    //get all users
    List<User> getAllUsers();

    //get user by userid
    User getUserById(String id);
}
