package com.rsk.springsecurity.p1.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsk.springsecurity.p1.model.Contact;
import com.rsk.springsecurity.p1.repositories.ContactRepository;
import com.rsk.springsecurity.p1.services.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepo;

	@Override
	public Contact saveContact(Contact c) {
		return this.contactRepo.save(c);
	}

	@Override
	public List<Contact> getAllContacts() {
		return this.contactRepo.findAll();
	}

}
