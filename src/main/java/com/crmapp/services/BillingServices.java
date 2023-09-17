package com.crmapp.services;

import java.util.List;

import com.crmapp.entity.Billing;

public interface BillingServices {
	public void saveBill(Billing bill);

	public List<Billing> listAllBills();

	public Billing getBillById(long id);

}
