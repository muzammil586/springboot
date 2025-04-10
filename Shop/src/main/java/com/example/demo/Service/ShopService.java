package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.ShopData;
import com.example.demo.Repository.ShopRepository;

@Service
public class ShopService {
     @Autowired
	private ShopRepository repository;
     
     public ShopData insert(ShopData shopdata) {
    	 
		return repository.save(shopdata);
    	 
     }
     
	
}
