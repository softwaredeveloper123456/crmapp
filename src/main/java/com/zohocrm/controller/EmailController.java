package com.zohocrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.dto.Email;
import com.zohocrm.ulits.EmailService;

@Controller
public class EmailController {
	
	private final EmailService emailService;
	
	
	public EmailController(EmailService emailService) {
		this.emailService = emailService;
	}

	@PostMapping("/sendEmail")
	public String getEmailId(@RequestParam("email") String email, Model map) {
		map.addAttribute("email", email);
		return "compose_email";
	}
	
		@PostMapping("/sending")
		public String sendingEmail(Email email, Model map) {
			emailService.sendEmail(email.getEmail(), email.getSubject(), email.getContent());
			map.addAttribute("msg", "Email Sending Successful");
			return"compose_email";
		}
	
}
