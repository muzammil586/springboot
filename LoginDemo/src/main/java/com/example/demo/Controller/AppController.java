package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Model.User;

@Controller
public class AppController {
   @GetMapping("/")
	public String index( Model model) {
		model.addAttribute("userform",new User());
		return "Login";
	}
    
   @PostMapping("/logcheck")
   public String logcheck(@ModelAttribute User user, Model model) {
	   if(user.getUsername().equals("muzammil") && user.getPassword().equals("muzzi1122") )
		   return "Home";
	   
	   else {
		   model.addAttribute("userform",new User());
		   model.addAttribute("msg" ,"Invalid UserName and Password");
		   return "Login";
	   }
	
	   
   }
  
}
