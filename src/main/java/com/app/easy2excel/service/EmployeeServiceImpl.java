package com.app.easy2excel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.easy2excel.dto.EmployeeDTO;
import com.app.easy2excel.entity.Employee;
import com.app.easy2excel.exception.ResourceNotFoundException;
import com.app.easy2excel.mapper.EmployeeMapper;
import com.app.easy2excel.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	EmployeeMapper employeeMapper;

	@Override
	public Employee saveEmployee(EmployeeDTO employeeDTO) {
		return employeeRepository.save(employeeMapper.toEntity(employeeDTO));
	}

	@Override
	public EmployeeDTO getEmployeeById(Long id) {
		return employeeRepository.findById(id).map(employeeMapper::toDTO)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found :" + id));
	}
}
