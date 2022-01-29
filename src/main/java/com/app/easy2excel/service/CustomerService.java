package com.app.easy2excel.service;

import com.app.easy2excel.dto.CustomerDTO;
import com.app.easy2excel.entity.Customer;

public interface CustomerService {
	Customer saveCustomer(CustomerDTO customerDTO);
	CustomerDTO getCustomerById(Long id);
}
