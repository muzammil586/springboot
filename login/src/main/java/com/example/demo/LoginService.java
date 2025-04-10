package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
	private LoginRepository loginRepository;
	
    public Login add(Login login) {
    	
		return loginRepository.save(login);
    	
    }
    
    public List<Login> get() {
    	
  		return loginRepository.findAll();
      	
      }
    
  public Login getById(int login) {
    	
		return loginRepository.findById(login).orElse(null);
    	
    }
  
  public String delete(int login) {
  	
		 loginRepository.deleteById(login);
		return "Daleted";
  	
  }
	
}
