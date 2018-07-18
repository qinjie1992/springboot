package com.example.service.itf;

import java.util.List;

import com.example.entity.User;

public interface IUser {
	List<User> findAll();
	User findById(int userId);
	int insertUser(User user);
}
