package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Student;

@Controller
public class StudentController {
	
	
	@GetMapping("/")
	  public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "user-form"; // Thymeleaf template name
    }
	
	
    // Handle form submission
    @PostMapping("/submitForm")
    public String submitForm(@ModelAttribute Student student, Model model) {
        model.addAttribute("student", student);
        return "studentdataview" ; // Redirect to a success page
    }
	
     @GetMapping("/studentdata")
	public String studentData(Model model) {
		//Student student=new Student(101,"muzammil",20,"karachi");
    	 Student student=new Student();
    	 student.setName("Ali");
    	 student.setAddress("Hyd");
    	 student.setAge(78);
    	 student.setRollno(23);
    	 
    	 model.addAttribute("student",student);
		return "studentdataview";
	}
}
