package com.example.mapper;

import java.util.List;

import com.example.entity.User;

public interface UserMapper {
	
	List<User> findAll();
	User findById(int userId);
	int insertUser(User user);
	
}
