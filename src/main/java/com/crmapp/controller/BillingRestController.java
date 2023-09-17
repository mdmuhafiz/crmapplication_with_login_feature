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

import com.crmapp.entity.Billing;
import com.crmapp.repository.BillingRepository;

@RestController
@RequestMapping("/billings")
public class BillingRestController {
	@Autowired
	private BillingRepository billRepo;
	@GetMapping
	public List<Billing> getAllBillFromDataBase(){
		List<Billing> bill = billRepo.findAll();
		return bill;
	}
	@PostMapping
	public void saveBilling(@RequestBody Billing billing) {
		billRepo.save(billing);
	}
	@PutMapping
	public void updateBill(@RequestBody Billing billing) {
		billRepo.save(billing);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteBilling(@PathVariable long id) {
		billRepo.deleteById(id);
	}

}
