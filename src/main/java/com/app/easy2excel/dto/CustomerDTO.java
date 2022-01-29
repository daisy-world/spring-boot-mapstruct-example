package com.app.easy2excel.dto;

import lombok.Data;

@Data
public class CustomerDTO {
	private Long id;
	private String customerName;
	private String url;
	private AddressDTO addressDTO;

}
