package com.app.easy2excel.controller;

import com.app.easy2excel.dto.ContactDTO;
import com.app.easy2excel.entity.Contact;
import com.app.easy2excel.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class ContactController {
    @Autowired
    ContactService contactService;

    @PostMapping("/contact")
    public ResponseEntity<Contact> saveContact(@RequestBody ContactDTO contactDTO){
     return ResponseEntity.ok(contactService.saveCustomer(contactDTO));
    }
    @GetMapping("/contact/{id}")
    public ResponseEntity<ContactDTO> getContactById(@PathVariable Long id){
    return ResponseEntity.ok(contactService.getCustomerById(id));
    }

}
