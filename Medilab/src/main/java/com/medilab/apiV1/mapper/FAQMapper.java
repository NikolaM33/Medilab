package com.medilab.apiV1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.medilab.apiV1.model.FAQDTO;
import com.medilab.domain.FAQ;

@Mapper
public interface FAQMapper {

	FAQMapper INSTANCE=Mappers.getMapper(FAQMapper.class);
	FAQDTO faqToFAQDTO (FAQ faq);
}
