package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.itf.IUser;
@Service("UserImpl")
public class UserImpl implements IUser {
	
	@Autowired 
	private UserMapper userMapper;
	
	
	public List<User> findAll() {
		return userMapper.findAll();
	}
	
	public User findById(int userId) {
		return userMapper.findById(userId);
	}
 
	public int insertUser(User user) {
		return userMapper.insertUser(user);
	}

}
