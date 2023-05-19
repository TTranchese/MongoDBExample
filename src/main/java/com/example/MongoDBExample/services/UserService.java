package com.example.MongoDBExample.services;

import com.example.MongoDBExample.entities.User;
import com.example.MongoDBExample.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public User putUser(User user) {
		userRepository.save(user);
		return user;
	}
	
	public User getUser(String id) {
		Optional<User> optionalUser = userRepository.findById(id);
		return optionalUser.get();
	}
	
	public User updateUser(User user) {
		userRepository.save(user);
		return user;
	}
	
	public void deleteUser(String id) {
		userRepository.delete(userRepository.findById(id).get());
	}
}
