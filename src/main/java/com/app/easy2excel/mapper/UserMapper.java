package com.app.easy2excel.mapper;

import com.app.easy2excel.dto.UserDTO;
import com.app.easy2excel.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({
            @Mapping(source = "emailId", target = "email"),
            @Mapping(source = "contactNo", target = "phoneNo")
    })
    User  toEntity(UserDTO userDTO);

    @Mappings({
            @Mapping(source = "email", target = "emailId"),
            @Mapping(source = "phoneNo", target = "contactNo")
    })
    UserDTO toDTO(User user);
}
