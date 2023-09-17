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

import com.crmapp.entity.Lead;
import com.crmapp.repository.LeadRepository;

@RestController
@RequestMapping("/leads")
public class LeadRestController {
	@Autowired
	private LeadRepository leadRepo;
	@GetMapping
	public List<Lead> getAllLeadFromDatabase(){
		List<Lead> lead = leadRepo.findAll();
		return lead;
	}
	@PostMapping
	public void saveLead(@RequestBody Lead lead) {
		leadRepo.save(lead);
	}
	@PutMapping
	public void updateLead(@RequestBody Lead lead) {
		leadRepo.save(lead);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteMapping(@PathVariable long id) {
		leadRepo.deleteById(id);
		
	}
	

}
