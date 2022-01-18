package com.app.easy2excel.service;

import com.app.easy2excel.dto.ContactDTO;
import com.app.easy2excel.entity.Contact;

public interface ContactService {
     Contact saveCustomer(ContactDTO contactDTO);
     ContactDTO getCustomerById(Long id);

}
