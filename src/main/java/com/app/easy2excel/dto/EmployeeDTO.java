package com.app.easy2excel.dto;

import lombok.Data;

@Data
public class EmployeeDTO {
	private Long id;
	private String name;
	private float salary;
	private String dateOfJoining;
}
