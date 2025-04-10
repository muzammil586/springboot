package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
	private StudentRepository repository;
	public Student addData(Student student) {
		
		return repository.save(student);
		
	}
}
