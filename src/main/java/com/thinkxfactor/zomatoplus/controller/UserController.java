package com.thinkxfactor.zomatoplus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
	private UserRepository userRepository;

/*	@GetMapping("/loginEn")
	public String userLogin(@RequestParam("username") String username,
			@RequestParam("password") String password)
	{
		User obj= new User();
		obj.setUsername("ASD");
		obj.setPassword("123");
		return "You are logged in";
	}*/

	@GetMapping("/all")
	public List<User> getAll(){
		List<User> listofuser=userRepository.findAll();
	
		return listofuser;
	}
	
	@PostMapping("/add")
	public User adduser(@RequestBody User user) {
		User persistedUser=userRepository.save(user); 
		return persistedUser;
		}
	
	@PostMapping("/login")
	public User userlogin(@RequestBody User user)
	{
		String username=user.getName();
		String password=user.getPassword();
		
		User usr= userRepository.findByNameAndPassword( username,  password); 
	
	
	
		return user;
	}
}
