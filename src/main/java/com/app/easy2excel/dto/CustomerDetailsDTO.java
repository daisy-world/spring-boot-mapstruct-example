package com.app.easy2excel.dto;

import lombok.Data;

@Data
public class CustomerDetailsDTO {
	private Long id;
	private String customerName;
	private String url;
	private String address1;
	private String city;
	private String state;
	private String country;
	private String pinCode;

}