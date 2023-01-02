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
@RequestMapping("/api/custdocu")
public class CustDocuController {
	
	@Autowired
	private CustDocuRepo custdocurepo;
	
	
	
	@PostMapping(" ")
	public void saveData(@RequestBody CustDocu custDocu) {
		Student student=new Student();
		custDocu.setStudent(student);
		
		custdocurepo.save(custDocu);
		
		}

}
