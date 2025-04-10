package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Entity.ShopData;
import com.example.demo.Service.ShopService;

@Controller
public class ShopController {
     @Autowired
	private ShopService service;
     
     @GetMapping("/")
     public String  show(Model model) {
    	  model.addAttribute("show",new ShopData());
    	 return "Shop";
     }
     
     @PostMapping("/save")
     public String insert(@ModelAttribute ShopData shopData) {
    	 
    	 
		return ""+service.insert(shopData);
		}
     
}
