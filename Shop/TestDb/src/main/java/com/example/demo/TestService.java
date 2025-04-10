package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
   
	@Autowired
	private TestRepository repository;
	
	public Test add(Test test) {
		
		return repository.save(test);
		
	}
	
public List<Test> get() {
		
		return repository.findAll();
		
	}


public String delete(int testId) {
	
	repository.deleteById(testId);
	return "Deleted";
}

public Test getById(int testId) {
	return repository.findById(testId).orElse(null);
}

	
}
