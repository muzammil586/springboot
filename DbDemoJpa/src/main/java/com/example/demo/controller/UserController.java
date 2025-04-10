package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
     @Autowired
	private UserService userService;
	
     @PostMapping("/test")
	public User add(@RequestBody  User user) {
		return userService.addUser(user);
		
	}
     
     
     @GetMapping("/test")
 	public List<User> getall() {
 		return userService.show();
 		
 	}
	
}
 