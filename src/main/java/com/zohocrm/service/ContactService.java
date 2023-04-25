package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entity.Contact;

public interface ContactService {

	void createContact(Contact contact);

	List<Contact> findAllLeads();

	Contact getContactByI(long id);
}
