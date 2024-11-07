package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/users")
public class studentController {
	
	@Autowired
	private studentRepository studentRepository;
	
	@GetMapping
	public List<student> getAllstudent() {
		return studentRepository.findAll();
	}
	
	@PostMapping
	public student createstudent(@RequestBody student student) {
		return studentRepository.save(student);
	}
}
