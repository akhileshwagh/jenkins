package com.sunbeam.main.service;

import java.util.List;

import com.sunbeam.main.payload.UserDto;

public interface UserService {
	
	//add user
	UserDto createUser(UserDto user);
	
	//update user
	UserDto updateUser(UserDto user, Integer userId);

	//get user by id
	UserDto getUserById(Integer userId);
	
	//get ala user
	List<UserDto> getAllUsers();
	
	//delete user
	void deleteUser(Integer userId);

}
