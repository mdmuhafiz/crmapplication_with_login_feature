package com.crmapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crmapp.entity.Lead;
import com.crmapp.repository.LeadRepository;

@RestController
public class LeadRestController1 {
	@Autowired
	private LeadRepository leadRepo;
	@RequestMapping("/lead/{id}")
	public Lead getOneLeadFromDataBase(@PathVariable long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

}
