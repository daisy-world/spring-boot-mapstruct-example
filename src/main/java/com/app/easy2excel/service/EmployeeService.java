package com.app.easy2excel.service;

import com.app.easy2excel.dto.EmployeeDTO;
import com.app.easy2excel.entity.Employee;

public interface EmployeeService {
 Employee saveEmployee(EmployeeDTO employeeDTO);
 EmployeeDTO getEmployeeById(Long id);
}
