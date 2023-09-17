package com.crmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmapp.entity.Contact;
import com.crmapp.entity.Lead;
import com.crmapp.services.ContactServices;
import com.crmapp.services.LeadServices;

@Controller
public class ContactController {
	@Autowired
	private ContactServices contactServices;
	
	@Autowired
	private LeadServices leadServices;
	
	@RequestMapping("/convertToContact")
	public String convertToContact(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadServices.updateLeadById(id);
		Contact contact = new Contact();
		contact.setId(lead.getId());
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setLeadSource(lead.getLeadSource());
		contact.setEmail(lead.getEmail());
		contact.setCity(lead.getCity());
		contact.setMobile(lead.getMobile());
		contactServices.saveContact(contact);
		leadServices.deleteLeadById(id);
		List<Contact> contacts = contactServices.findAllContact();
		model.addAttribute("contact", contacts);
		return "contactResult";
	}
	@RequestMapping("/getContactById")
	public String getContactById(@RequestParam("id") long id,ModelMap model) {
		Contact contact = contactServices.getContactById(id);
		model.addAttribute("contact", contact);
		return "contactInfo";
	}
	@RequestMapping("/listallcontacts")
	public String listAllContacts(ModelMap model) {
		List<Contact> contact = contactServices.findAllContact();
		model.addAttribute("contact", contact);
		return "contactResult";
	}
	@RequestMapping("/getBillingByid")
	public String getBillingByid(@RequestParam("id") long id,ModelMap model) {
		Contact contact = contactServices.getContactById(id);
		model.addAttribute("contact", contact);
		return "billingPage";
	}

}
