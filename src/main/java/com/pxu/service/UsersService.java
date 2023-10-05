package com.pxu.service;


import com.pxu.entity.Users;

public interface UsersService {

	public void addUsers(Users users);
	
	Users findUserByusername(String username);
}
