package com.app.easy2excel.service;

import com.app.easy2excel.dto.ContactDTO;
import com.app.easy2excel.entity.Contact;
import com.app.easy2excel.exception.ResourceNotFoundException;
import com.app.easy2excel.mapper.ContactMapper;
import com.app.easy2excel.repository.ContactRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    ContactRepository contactRepository;
   @Autowired
    ContactMapper contactMapper;
  //  ContactMapper contactMapper = Mappers.getMapper(ContactMapper.class);
    @Override
    public Contact saveContact(ContactDTO contactDTO) {
        return contactRepository.save(contactMapper.contactDtoToContact(contactDTO));
    }

    @Override
    public ContactDTO getContactById(Long id) {
        return contactRepository.findById(id)
                .map(contactMapper::contactToContactDTO)
                .orElseThrow(()->new ResourceNotFoundException("contact not found :" +id));

    }
}
