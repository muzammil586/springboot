package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
	StudentRepository repository; 
    
    
    public Iterable<Student> showall(){
		return repository.findAll();
    }
    
    public Student insert(Student std) {
    	return repository.save(std);
    }
    
    public void delete(int rollno) {
    	repository.deleteById(null);
    }
    
    public Student get(int rollno) {
    	return repository.findById(rollno).get();
    }
    
}
