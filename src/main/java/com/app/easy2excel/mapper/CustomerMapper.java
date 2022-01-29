package com.app.easy2excel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.app.easy2excel.dto.CustomerDTO;
import com.app.easy2excel.entity.Address;
import com.app.easy2excel.entity.Customer;


/*Multiple Source Classes*/
@Mapper (componentModel = "spring")
public interface CustomerMapper {
	
    @Mapping(source = "customer.name", target = "customerName")
    @Mapping(source = "address.zipCode", target = "pinCode")

    CustomerDTO toDTO(Customer customer,Address address);


}
