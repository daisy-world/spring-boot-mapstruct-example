package com.app.easy2excel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.easy2excel.dto.StudentDTO;
import com.app.easy2excel.entity.Student;
import com.app.easy2excel.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@PostMapping("/student")
	public ResponseEntity<Student> saveStudent(@RequestBody StudentDTO studentDTO) {
		return ResponseEntity.ok(studentService.saveStudent(studentDTO));
	}

	@GetMapping("/student/{id}")
	public ResponseEntity<StudentDTO> getStudentById(@PathVariable Long id) {
		return ResponseEntity.ok(studentService.getStudentById(id));
	}

}
