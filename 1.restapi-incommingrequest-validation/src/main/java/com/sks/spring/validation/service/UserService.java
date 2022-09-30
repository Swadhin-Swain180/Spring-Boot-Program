package com.sks.spring.validation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sks.spring.validation.dto.UserRequest;
import com.sks.spring.validation.entity.User;
import com.sks.spring.validation.exception.UserNotFoundException;
import com.sks.spring.validation.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User saveUser(UserRequest userRequest) {
		
	User user = new User(0, userRequest.getName(), userRequest.getEmail(), userRequest.getMobile(),
				userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());
	
		return userRepository.save(user);
	}
	
	public java.util.List<User> getAllUsers()
	{
		return userRepository.findAll();
	}
	
	 public User getUser(int id) throws UserNotFoundException {
	        User user= userRepository.findByUserId(id);
	        if(user!=null){
	        	return user;
	        }
	        else {
	        	throw new UserNotFoundException("user not found with id : "+id);
	        }
	    }
}
