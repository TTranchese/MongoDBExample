package com.example.MongoDBExample.controllers;

import com.example.MongoDBExample.entities.User;
import com.example.MongoDBExample.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping
	public User putUser(@RequestBody User user){
		return userService.putUser(user);
	}
}
