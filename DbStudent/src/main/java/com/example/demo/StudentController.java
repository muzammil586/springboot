package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
	private StudentService service ;
	@PostMapping("/Data")
	public Student data(@RequestBody Student student) {
		return service.addData(student);
		
	}
}
