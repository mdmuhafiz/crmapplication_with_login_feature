package com.crmapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmapp.entity.Billing;
import com.crmapp.repository.BillingRepository;

@Service
public class BillingServicesImpl implements BillingServices {
	@Autowired
	private BillingRepository billRepo;

	@Override
	public void saveBill(Billing bill) {
		billRepo.save(bill);
		
	}

	@Override
	public List<Billing> listAllBills() {
		List<Billing> billing = billRepo.findAll();
		return billing;
	}

	@Override
	public Billing getBillById(long id) {
		Optional<Billing> findById = billRepo.findById(id);
		Billing billing = findById.get();
		return billing;
	}
	

	

}
