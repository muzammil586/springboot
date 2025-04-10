package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
	private TestService testService;
	@PostMapping("/add")
    public Test addTest(@RequestBody Test test) {
    	
    	return testService.add(test);
    }
	
	
	@GetMapping("/add")
    public List<Test> getTest() {
    	
    	return testService.get();
    }
	
	@DeleteMapping("/add/{testId}")
	public String delete(@PathVariable("testId") int testId) {
		
		return testService.delete(testId);
		
	}
	
	@GetMapping("/add/{testId}")
	public Test getId(@PathVariable("testId") int testId) {
		
		return testService.getById(testId);
		
	}
	
	
	@PutMapping("/add/{testId}")
    public Test update(@RequestBody Test test ,@PathVariable("testId") int testId) {
		Test testUpdate=testService.getById(testId);
		testUpdate.setName(test.getName());
		testUpdate.setEmail(test.getEmail());
		testUpdate.setAddress(test.getAddress());
		testUpdate.setAge(test.getAge());
		testUpdate.setContact(test.getContact());
		
		
    	
    	return testService.add(testUpdate);
    }
}
