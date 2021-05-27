package com.medilab.apiV1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.medilab.apiV1.model.ContactDTO;
import com.medilab.domain.Contact;

@Mapper
public interface ContactMapper {
ContactMapper INSTANCE=Mappers.getMapper(ContactMapper.class);
Contact contactDTOtoContact(ContactDTO contactDTO);
ContactDTO contactToContactDTO (Contact contact);
}
