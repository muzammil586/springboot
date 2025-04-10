package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    
	public int add(Calculator cal) {
		
		int res=cal.getNam1()+cal.getNum2();
		return res;
		
	}
	
}
