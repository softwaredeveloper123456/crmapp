package com.zohocrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zohocrm.entity.Contact;
import com.zohocrm.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	private final ContactRepository contactRepo;
	
	
	
	public ContactServiceImpl(ContactRepository contactRepo) {
		this.contactRepo = contactRepo;
	}



	@Override
	public void createContact(Contact contact) {
		contactRepo.save(contact);

	}



	@Override
	public List<Contact> findAllLeads() {
		List<Contact> findAll = contactRepo.findAll();
		return findAll;
	}



	@Override
	public Contact getContactByI(long id) {

		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}

}
