package com.zohocrm.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entity.Contact;
import com.zohocrm.entity.Lead;
import com.zohocrm.service.ContactService;

@Controller
public class ContactController {

	private final ContactService contactService;

	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}
	
	
	
	@RequestMapping("/listallContacts")
	public String getAllLeads(Model map) {
		List<Contact> findAllLeads = contactService.findAllLeads();
		map.addAttribute("leads", findAllLeads);
		
		return "contact_list";
	}
	
	
}
