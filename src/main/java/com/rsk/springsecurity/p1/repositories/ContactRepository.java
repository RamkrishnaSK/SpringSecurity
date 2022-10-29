package com.rsk.springsecurity.p1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rsk.springsecurity.p1.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
