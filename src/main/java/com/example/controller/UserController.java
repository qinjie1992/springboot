package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.example.entity.User;
import com.example.service.itf.IUser;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUser uServ;
	
	@RequestMapping("/findAll")
	public ModelAndView findAll(){
		ModelAndView mav = new ModelAndView("list");
		List<User> user = uServ.findAll();
		mav.addObject("user", user);
		return mav;
	}
	 
	 
}
