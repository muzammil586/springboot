package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Autowired
	CalculatorService service;
	@PostMapping("/Test")
    public String add(@RequestBody Calculator calculator) {
    	
    	
    	return "Addition is :"+ service.add(calculator);
    }
	
}
