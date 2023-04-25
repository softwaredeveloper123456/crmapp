package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Contact;
import com.zohocrm.entity.Lead;
import com.zohocrm.service.ContactService;
import com.zohocrm.service.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadService;
	
	private final ContactService contactService;

	public LeadController(ContactService contactService) {
		this.contactService = contactService;
	}
	
	@GetMapping("/getFrom")
	public String viewCreatePage() {
		return"create_new_lead";
	}
	
	@RequestMapping("/createLeads")
	public String craeteLead(@ModelAttribute("lead") Lead lead, Model map) {
		leadService.saveOneLead(lead);
		map.addAttribute("lead", lead);
		return "lead_info";
	}
	
	
	@PostMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id, Model map) {
		Lead lead = leadService.findLeadById(id);
		
		Contact contact = new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		
		contactService.createContact(contact);
		leadService.deleteById(id);
		
		List<Contact> findAllLeads = contactService.findAllLeads();
		map.addAttribute("leads", findAllLeads);
		return "contact_list";
	}
	
	@RequestMapping("/listallLeads")
	public String getAllLeads(Model map) {
		List<Lead> findAllLeads = leadService.findAllLeads();
		map.addAttribute("leads", findAllLeads);
		return "list_leads";
	}
	
	@RequestMapping("/leadsInfo")
	public String leadInfo(@RequestParam("id") long id, Model map) {
		Lead leads = leadService.findLeadById(id);
		map.addAttribute("lead", leads);
		return "lead_info";
	}
}
