package com.crmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmapp.dto.LeadData;
import com.crmapp.entity.Lead;
import com.crmapp.services.LeadServices;

@Controller
public class LeadController {
	@Autowired
	private LeadServices leadServices;
	
	@RequestMapping("/viewleadpage")
	public String viewLeadPage() {
		return "lead";
	}
	@RequestMapping("/saveLead")
	public String saveLeadData(Lead lead,ModelMap model) {
		leadServices.saveLead(lead);
		model.addAttribute("lead", lead);
		return "leadInfo";
	}
	//@RequestMapping("/saveLead")
	//public String saveLeadData(@ModelAttribute Lead lead,ModelMap model) {
		//leadServices.saveLead(lead);
		//model.addAttribute("msg", "Saved Sucessfully!");
		//return "lead";
	//}
	//@RequestMapping("/saveLead")
	//public String saveLeadData(LeadData data,ModelMap model) {
		//Lead l = new Lead();
		//l.setId(data.getId());
		//l.setFirstName(data.getFirstName());
		//l.setLastName(data.getLastName());
		//l.setLeadSource(data.getLeadSource());
		//l.setEmail(data.getEmail());
		//l.setCity(data.getCity());
		//l.setMobile(data.getMobile());
		//leadServices.saveLead(l);
		//model.addAttribute("msg", "Your information is saved sucessfully!");
		
		//return "lead";
	//}
	//@RequestMapping("/saveLead")
	//public String saveLead(
			              // @RequestParam("firstName") String firstName,
			               //@RequestParam("lastName") String lastName,
			               //@RequestParam("leadSource") String leadSource,
			               //@RequestParam("email") String email,
			               //@RequestParam("city") String city,
			               //@RequestParam("mobile") String mobile,ModelMap model) {
		//Lead l = new Lead();
		
		//l.setFirstName(firstName);
		//l.setLastName(lastName);
		//l.setLeadSource(leadSource);
		//l.setEmail(email);
		//l.setCity(city);
		//l.setMobile(mobile);
		//leadServices.saveLead(l);
		//model.addAttribute("msg", "save");
		//return "lead";
	//}
	
	
	@RequestMapping("/listallleads")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadServices.listallleads();
		model.addAttribute("lead", leads);
		return "leadResult";
	}
	@RequestMapping("/delete")
	public String deleteLead(@RequestParam("id") long id,ModelMap model) {
		leadServices.deleteLeadById(id);
		List<Lead> leads = leadServices.listallleads();
		model.addAttribute("lead", leads);
		return "leadResult";
	}
	@RequestMapping("/updateLeadById")
	public String updateLeadById(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadServices.updateLeadById(id);
		model.addAttribute("lead", lead);
		return "updatePage";
	}
	@RequestMapping("/updateLeads")
	public String updateLead(Lead lead,ModelMap model) {
		leadServices.saveLead(lead);
		
		List<Lead> leads = leadServices.listallleads();
		model.addAttribute("lead", leads);
		return "leadResult";
	}
	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadServices.updateLeadById(id);
		model.addAttribute("lead", lead);
		return "leadInfo";
	}
	

}
