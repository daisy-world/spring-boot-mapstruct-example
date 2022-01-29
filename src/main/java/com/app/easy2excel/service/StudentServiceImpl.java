package com.app.easy2excel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.easy2excel.dto.StudentDTO;
import com.app.easy2excel.entity.Student;
import com.app.easy2excel.exception.ResourceNotFoundException;
import com.app.easy2excel.mapper.StudentMapper;
import com.app.easy2excel.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	StudentMapper studentMapper ;

	@Override
	public Student saveStudent(StudentDTO studentDTO) {
		return studentRepository.save(studentMapper.toEntity(studentDTO));

	}

	@Override
	public StudentDTO getStudentById(Long id) {
		return studentRepository.findById(id).map(studentMapper::toDTO)
				.orElseThrow(() -> new ResourceNotFoundException("Student not found :" + id));
	}

}
