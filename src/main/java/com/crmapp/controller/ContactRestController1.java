package com.crmapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crmapp.entity.Contact;
import com.crmapp.repository.ContactRepository;

@RestController
public class ContactRestController1 {
	@Autowired
	private ContactRepository contactRepo;
	@RequestMapping("/contact/{id}")
	public Contact getOneContactFromDataBase(@PathVariable long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
				
	}

}
