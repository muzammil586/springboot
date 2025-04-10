package com.example.demo.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Userdata")
public class Userdata {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	private String username;
	private String password;
	private int age;
	private int number;
	private String address;
	
	

	public Userdata() {
	}

	
	public Userdata(int id, String username, String password, int age, int number, String address) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
		this.number = number;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	

}
