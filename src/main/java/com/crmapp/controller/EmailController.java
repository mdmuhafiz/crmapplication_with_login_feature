package com.crmapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmapp.utilities.EmailServices;

@Controller
public class EmailController {
	@Autowired
	private EmailServices emailServices;
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("email") String email,ModelMap model) {
		model.addAttribute("to", email);
		return "composeEmail";
	}
	@RequestMapping("/send")
	public String send(@RequestParam("to") String to,@RequestParam("sub") String sub,@RequestParam("massage") String massage,ModelMap model) {
		emailServices.sendSimpleMessage(to, sub, massage);
		model.addAttribute("msg", "Your email is send sucessfully");
		return "composeEmail";
	}

}
