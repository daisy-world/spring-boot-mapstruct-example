package com.app.easy2excel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.app.easy2excel.dto.AddressDTO;
import com.app.easy2excel.dto.CustomerDTO;
import com.app.easy2excel.entity.Address;
import com.app.easy2excel.entity.Customer;


/*Mapping child beans*/
@Mapper (componentModel = "spring",uses = {AddressMapper.class})
public interface CustomerMapper {
	
	 @Mapping(source = "customerName", target = "name")
	 @Mapping(source = "addressDTO", target = "address")
	 Customer toEntity(CustomerDTO customerDTO);
	  
    @Mapping(source = "name", target = "customerName")
    @Mapping(source = "address", target = "addressDTO")
    CustomerDTO toDTO(Customer customer);
    
  


}
