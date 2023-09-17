package com.crmapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmapp.entity.Contact;
import com.crmapp.repository.ContactRepository;

@Service
public class ContactServicesImpl implements ContactServices {
	@Autowired
	private ContactRepository contactRepo;
	

	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);
		
	}


	@Override
	public List<Contact> findAllContact() {
		List<Contact> contact = contactRepo.findAll();
		return contact;
	}


	@Override
	public Contact getContactById(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}

}
