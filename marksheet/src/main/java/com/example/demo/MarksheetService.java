package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MarksheetService {

	 public String  marks(Marksheet mark) {
		 int obtain=mark.getBio()+mark.getEng()+mark.getIsl()+mark.getMath()+mark.getSci();
		
		 int total=500;
		
		 int per=(obtain * 100/total);
		 
		return "your Obtain marks : "+ obtain+"\n your total  marks :  "+total+"\n your Percentage marks : "+per;
		 
	 }
	
}
