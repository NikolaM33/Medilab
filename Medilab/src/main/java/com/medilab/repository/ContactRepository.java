package com.medilab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medilab.domain.Contact;

public interface ContactRepository  extends JpaRepository<Contact, Long>{

}
