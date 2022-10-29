package com.rsk.springsecurity.p1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsk.springsecurity.p1.model.Contact;
import com.rsk.springsecurity.p1.services.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private ContactService contactService;

	@PostMapping("/")
	public Contact saveContact(@RequestBody Contact c) {
		return this.contactService.saveContact(c);
	}

	@GetMapping("/")
	public List<Contact> findAllContact() {
		return this.contactService.getAllContacts();
	}

}
