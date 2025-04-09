package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

import jakarta.websocket.server.PathParam;

@Controller
public class AppController {

	@Autowired
	StudentService service;
	
	@GetMapping("/")
	public String show(Model model) {
		
		model.addAttribute("data",service.showall());
		return "show";
	}
	
	@GetMapping("/insert")
	public String insert(Model model) {
		
		model.addAttribute("Student", new Student());
		return "insert";
	}
	
	
	@PostMapping("/save")
	public String insert(@ModelAttribute Student std) {
		
		service.insert(std);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{rollno}")
	public String delete(@PathVariable int rollno) {
		service.delete(rollno);
		return "redirect:/";
				
		
	}
	
	@GetMapping("/update/{rollno}")
	public ModelAndView update(@PathVariable int rollno) {
		ModelAndView mv=new ModelAndView("insert");
		Student std=service.get(rollno);
		mv.addObject("Student",std);
		return mv;
	}
	
	
	
}
