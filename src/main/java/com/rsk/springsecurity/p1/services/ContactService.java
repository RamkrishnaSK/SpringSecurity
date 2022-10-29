package com.rsk.springsecurity.p1.services;

import java.util.List;

import com.rsk.springsecurity.p1.model.Contact;

public interface ContactService {
	public Contact saveContact(Contact c);
	public List<Contact> getAllContacts(); 
}
