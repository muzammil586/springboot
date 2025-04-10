package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/sayhello")
	public String sayhello(Model model) {
		model.addAttribute("msg1","Hello Muzammil");
		model.addAttribute("msg2","Welcome from Muzammil Web Application");
	 
		return "helloworld";
		
	
	}

}
