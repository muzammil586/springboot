package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Entity.Userdata;
import com.example.demo.Service.UserService;

@Controller
public class UserController {
	@Autowired
   UserService userService;
	
	@GetMapping("/")
	public String show(Model model) {
		
		model.addAttribute("data", new Userdata());
		
		return "Login";
		
	}
	
	@PostMapping("/getall")
	public String Get(Userdata userdata,Model model) {
		
	Userdata data= userService.showall(userdata);
	if(data==null) {
		System.out.println("No record");
		model.addAttribute("Data",new Userdata());
		return "LoginSuccess";
	}else {
		
		model.addAttribute("showdata",data);
     	return "show";
	}	
		

		
			
		
	}

	
	@PostMapping("/insert")
	public String insert(@ModelAttribute Userdata userdata,Model model) {
		 
		String n=userdata.getUsername();
		String p=userdata.getPassword();
		int a=userdata.getAge();
		int nb=userdata.getNumber();
		String ad=userdata.getAddress();
		System.out.println(n);
		System.out.println(p);
		System.out.println(a);
		System.out.println(nb);
		System.out.println(ad);
	
		model.addAttribute("Data", userService.insert(userdata));		
		
		return "show";
		
	}
   
}
