package com.medilab.apiV1.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FAQListDTO {

	List<FAQDTO> FAQ;
}
