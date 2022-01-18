package com.app.easy2excel.mapper;

import com.app.easy2excel.dto.ContactDTO;
import com.app.easy2excel.entity.Contact;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface ContactMapper {

    Contact contactDtoToContact(ContactDTO contactDTO);
    ContactDTO contactToContactDTO(Contact contact);

}
