package com.app.easy2excel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.easy2excel.dto.CustomerDTO;
import com.app.easy2excel.entity.Customer;
import com.app.easy2excel.mapper.CustomerMapper;
import com.app.easy2excel.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
   @Autowired
   CustomerMapper customerMapper;
	
	@Override
	public Customer saveCustomer(CustomerDTO customerDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO getCustomerById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
