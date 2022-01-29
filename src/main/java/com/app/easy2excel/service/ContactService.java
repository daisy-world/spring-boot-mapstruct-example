package com.app.easy2excel.service;

import com.app.easy2excel.dto.ContactDTO;
import com.app.easy2excel.entity.Contact;

public interface ContactService {
    Contact saveContact(ContactDTO contactDTO);
    ContactDTO getContactById(Long id);

}