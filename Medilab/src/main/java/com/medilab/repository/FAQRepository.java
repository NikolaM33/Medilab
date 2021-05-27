package com.medilab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medilab.domain.FAQ;

public interface FAQRepository extends JpaRepository<FAQ, Long> {

}
