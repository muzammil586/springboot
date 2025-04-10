package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.ShopData;
@Repository
public interface ShopRepository extends JpaRepository<ShopData, Integer>{
        
	
	
}
