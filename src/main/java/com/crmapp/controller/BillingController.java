package com.crmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmapp.entity.Billing;
import com.crmapp.services.BillingServices;

@Controller
public class BillingController {
	@Autowired
	private BillingServices billServices;
	
	@RequestMapping("/saveBill")
	public String saveBill(Billing bill,ModelMap model) {
		billServices.saveBill(bill);
		model.addAttribute("bill", bill);
		return "billInfo";
	}
	@RequestMapping("/listallbills")
	public String listAllBills(ModelMap model) {
		List<Billing> bill = billServices.listAllBills();
		model.addAttribute("bill", bill);
		return "billResult";
	}
	@RequestMapping("/getBillByLeadsId")
	public String getBillByLeadsId(@RequestParam("id") long id,ModelMap model) {
		Billing bill = billServices.getBillById(id);
		model.addAttribute("bill", bill);
		return "billInfo";
	}

}
