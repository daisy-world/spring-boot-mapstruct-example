package com.app.easy2excel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.easy2excel.dto.CustomerDTO;
import com.app.easy2excel.dto.CustomerDetailsDTO;
import com.app.easy2excel.entity.Address;
import com.app.easy2excel.entity.Customer;
import com.app.easy2excel.exception.ResourceNotFoundException;
import com.app.easy2excel.mapper.CustomerDetailsMapper;
import com.app.easy2excel.mapper.CustomerMapper;
import com.app.easy2excel.repository.AddressRepository;
import com.app.easy2excel.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
   @Autowired
   CustomerMapper customerMapper;
   @Autowired
   CustomerDetailsMapper customerDetailsMapper;
   @Autowired
   AddressRepository addressRepository;
   
	@Override
	public Customer saveCustomer(CustomerDTO customerDTO) {
        return customerRepository.save(customerMapper.toEntity(customerDTO));

	}

	@Override
	public CustomerDTO getCustomerById(Long id) {
		 return customerRepository.findById(id)
	                .map(customerMapper::toDTO)
	                .orElseThrow(()->new ResourceNotFoundException("customer not found :" +id));

	}

	@Override
	public CustomerDetailsDTO getCustomerDetailsById(Long id) {

		Customer customer = customerRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("customer not found :" +id));
		Address address = addressRepository.findById(customer.getAddress().getId()).orElseThrow(()->new ResourceNotFoundException("address not found :" +customer.getAddress().getId()));;
		return customerDetailsMapper.toCustomerDetailsDTO(customer, address);
	}

	

}
