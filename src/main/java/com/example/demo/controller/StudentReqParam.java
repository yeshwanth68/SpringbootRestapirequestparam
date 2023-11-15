package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

@RestController
public class StudentReqParam {
	
	
	@GetMapping("/student/reqparam")
	
	//http://localhost:8080/student/reqparam?firstname=Yeshwanth&lastname=Kumar
	
	public Student studentreqparam (@RequestParam (name="firstname") String firstname, @RequestParam (name="lastname") String lastname)
	{
		return new Student(firstname,lastname);
		
	}

}
