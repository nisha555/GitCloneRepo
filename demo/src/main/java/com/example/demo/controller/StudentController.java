package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.CustDocu;
import com.example.demo.entities.Student;
import com.example.demo.repositories.CustDocuRepo;
import com.example.demo.repositories.studentRepo;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	private studentRepo stdRepo;
	
	
	
	@PostMapping(" ")
	public void saveData(@RequestBody Student student) {
		CustDocu custDocu=new CustDocu();
		student.setCustDocu(custDocu);
		
	    stdRepo.save(student);
		
		}

}
