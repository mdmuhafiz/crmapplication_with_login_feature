package com.crmapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmapp.entity.Registration;
import com.crmapp.repository.RegistrationRepository;

@Controller
public class RegistrationController {
	@Autowired
	private RegistrationRepository regRepo;
	
	
	@RequestMapping("/viewregpage")
	public String viewRegPage() {
		return "login/reg";
	}
	
	@RequestMapping("/viewloginpage")
	public String viewLoginPage() {
		return "login/login";
	}
	
	@RequestMapping("/verifyReg")
	public String saveReg(Registration reg) {
		regRepo.save(reg);
		return "login/login";
	}
	
	@RequestMapping("/verifyLogin")
	public String verifyLoginPage(@RequestParam("email") String email,@RequestParam("password") String password,ModelMap model) {
		Registration reg = regRepo.findByEmail(email);
		if(reg != null) {
			if(reg.getEmail().equals(email) && reg.getPassword().equals(password)) {
				return "lead";
			}else {
				model.addAttribute("msg", "Invalid Email (OR) Password");
				return "login/login";
			}
		}
		model.addAttribute("msg", "Invalid Email (OR) Password");
		return "login/login";
	}

}
