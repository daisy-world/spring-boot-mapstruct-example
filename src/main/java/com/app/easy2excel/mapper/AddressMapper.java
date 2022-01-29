package com.app.easy2excel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.app.easy2excel.dto.AddressDTO;
import com.app.easy2excel.entity.Address;

@Mapper (componentModel = "spring")
public interface AddressMapper {
	  @Mapping(source = "pinCode", target = "zipCode")
	    Address toEntity(AddressDTO addressDTO);
		  
	   @Mapping(source = "zipCode", target = "pinCode")
	   AddressDTO toDTO(Address address);

}
