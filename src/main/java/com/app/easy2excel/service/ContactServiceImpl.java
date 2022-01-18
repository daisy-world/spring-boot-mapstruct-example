package com.app.easy2excel.service;

import com.app.easy2excel.dto.ContactDTO;
import com.app.easy2excel.entity.Contact;
import com.app.easy2excel.exception.ContactNotFoundException;
import com.app.easy2excel.mapper.ContactMapper;
import com.app.easy2excel.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    ContactRepository contactRepository;
    @Autowired
    ContactMapper contactMapper;

    @Override
    public Contact saveCustomer(ContactDTO contactDTO) {
        return contactRepository.save(contactMapper.contactDtoToContact(contactDTO));
    }

    @Override
    public ContactDTO getCustomerById(Long id) {
        return contactRepository.findById(id)
                .map(contactMapper::contactToContactDTO)
                .orElseThrow(()->new ContactNotFoundException("contact not found :" +id));

    }
}
