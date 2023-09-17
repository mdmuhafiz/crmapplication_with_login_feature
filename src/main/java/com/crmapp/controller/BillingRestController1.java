package com.crmapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crmapp.entity.Billing;
import com.crmapp.repository.BillingRepository;

@RestController
public class BillingRestController1 {
	@Autowired
	private BillingRepository billRepo;
	@RequestMapping("/billing/{id}")
	public Billing getOneBillFromDatabase(@PathVariable long id) {
		Optional<Billing> findById = billRepo.findById(id);
		Billing billing = findById.get();
		return billing;
	}

}
