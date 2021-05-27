package com.medilab.service;

import org.springframework.stereotype.Service;

import com.medilab.apiV1.mapper.ContactMapper;
import com.medilab.apiV1.model.ContactDTO;
import com.medilab.domain.Contact;
import com.medilab.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
private final ContactMapper contactMapper;
private final ContactRepository contactRepository;


	public ContactServiceImpl(ContactMapper contactMapper, ContactRepository contactRepository) {
	this.contactMapper = contactMapper;
	this.contactRepository = contactRepository;
}


	@Override
	public ContactDTO saveContact(ContactDTO contactDTO) {
		Contact contact=contactMapper.contactDTOtoContact(contactDTO);
		Contact savedContact=contactRepository.save(contact);
		
		
		return contactMapper.contactToContactDTO(savedContact);
	}

}
