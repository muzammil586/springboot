package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController{
	
	@Autowired
	Student student;
	
	
	@PostMapping("/test")
	public String Add() {
		int add=student.add(12, 10);
		
		
		return "Hello Demo..."+add;
		
	}
	@GetMapping("/sub")
	public String Sub() {
		
		int sub=student.sub(12, 20);
		
		
		return "Hello Demo..."+sub;
		
	}
	@GetMapping("/mult")
	public String Mult() {
		
		int mult=student.mult(12, 10);
		
		return "Hello Demo..."+mult;
		
	}
}