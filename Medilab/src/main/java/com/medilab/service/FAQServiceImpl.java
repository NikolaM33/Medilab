package com.medilab.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.medilab.apiV1.mapper.FAQMapper;
import com.medilab.apiV1.model.FAQDTO;
import com.medilab.apiV1.model.FAQListDTO;
import com.medilab.repository.FAQRepository;
@Service
public class FAQServiceImpl implements FAQService {
	
	private  final FAQMapper faqMapper;
	private final FAQRepository faqRepository;

	
	public FAQServiceImpl(FAQMapper faqMapper, FAQRepository faqRepository) {
		this.faqMapper = faqMapper;
		this.faqRepository = faqRepository;
	}


	@Override
	public FAQListDTO getAllFAQ() {
	List<FAQDTO> faq=faqRepository.findAll().stream().map(question->{
		FAQDTO faqDTO=faqMapper.faqToFAQDTO(question);
		return faqDTO;
	}).collect(Collectors.toList());	
		return new FAQListDTO(faq);
	}

}
