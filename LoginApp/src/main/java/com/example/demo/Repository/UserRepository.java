package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Userdata;

import jakarta.persistence.Id;
@Repository
public interface UserRepository  extends JpaRepository<Userdata, Integer>{

	Userdata getByUsernameAndPassword(String userName,String password);
	
}
