package com.example.demo.model;

public class Student {
    int rollno;
    String name;
    int age;
    String address;
    public Student() {
    	
    }
    public Student(int rollno, String name, int age, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
     
    
}
