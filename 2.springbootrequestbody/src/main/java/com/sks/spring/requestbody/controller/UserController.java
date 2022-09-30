package com.sks.spring.requestbody.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sks.spring.requestbody.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@PostMapping("/userInfo")
	public User saveUser(@RequestBody User user)
	{
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		return user;
		
	}

}
