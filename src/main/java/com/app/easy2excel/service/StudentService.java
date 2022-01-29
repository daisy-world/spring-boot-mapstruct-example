package com.app.easy2excel.service;

import com.app.easy2excel.dto.StudentDTO;
import com.app.easy2excel.entity.Student;

public interface StudentService {
	
	Student saveStudent(StudentDTO studentDTO);
	StudentDTO getStudentById(Long id);

}
