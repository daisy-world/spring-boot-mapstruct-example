package com.app.easy2excel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.app.easy2excel.dto.CustomerDetailsDTO;
import com.app.easy2excel.entity.Address;
import com.app.easy2excel.entity.Customer;

/*Multiple Source Classes*/
@Mapper (componentModel = "spring")
public interface CustomerDetailsMapper {

	 @Mapping(source = "customer.id", target = "id")
	 @Mapping(source = "customer.name", target = "customerName")
	 @Mapping(source = "address.zipCode", target = "pinCode")
	CustomerDetailsDTO toCustomerDetailsDTO(Customer customer ,Address address);

}
