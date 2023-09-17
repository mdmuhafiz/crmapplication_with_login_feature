package com.crmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crmapp.entity.Contact;
import com.crmapp.repository.ContactRepository;

@RestController
@RequestMapping("/contacts")
public class ContactRestController {
	@Autowired
	private ContactRepository contactRepo;
	@GetMapping
	public List<Contact> getAllContactFromDataBase(){
		List<Contact> contact = contactRepo.findAll();
		return contact;
	}
	@PostMapping
	public void saveContact(@RequestBody Contact contact) {
		contactRepo.save(contact);
	}
	@PutMapping
	public void updateContact(@RequestBody Contact contact) {
		contactRepo.save(contact);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteContact(@PathVariable long id) {
		contactRepo.deleteById(id);
	}

}
