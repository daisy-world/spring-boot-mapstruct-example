package com.app.easy2excel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.app.easy2excel.dto.UserDTO;
import com.app.easy2excel.entity.User;

/*Mappings Different Source and Target Fields*/

@Mapper(componentModel = "spring")
public interface UserMapper {

         @Mapping(source = "emailId", target = "email")
         @Mapping(source = "contactNo", target = "phoneNo")
          User  toEntity(UserDTO userDTO);


         @Mapping(source = "email", target = "emailId")
         @Mapping(source = "phoneNo", target = "contactNo")
         UserDTO toDTO(User user);
}
