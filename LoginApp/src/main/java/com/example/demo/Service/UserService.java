package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Userdata;
import com.example.demo.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
     UserRepository repository;
	
	public Userdata showall(Userdata userdata) {

			
	
		return repository.getByUsernameAndPassword(userdata.getUsername(),userdata.getPassword());
		
	}
	
	public Userdata insert(Userdata user) {
		
		return repository.save(user);
		
	}
	

	
	
}
