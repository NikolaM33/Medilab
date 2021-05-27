package com.medilab.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.medilab.domain.Departments;
import com.medilab.domain.Doctor;
import com.medilab.domain.FAQ;
import com.medilab.repository.DepartmentRepository;
import com.medilab.repository.DoctorRepository;
import com.medilab.repository.FAQRepository;

@Component
public class Bootstrap implements CommandLineRunner {
private final DoctorRepository doctorRepository;
private final DepartmentRepository departmentRepository;
private final FAQRepository faqRepository;

public Bootstrap(DoctorRepository doctorRepository, DepartmentRepository departmentRepository, FAQRepository faqRepository) {
	this.doctorRepository = doctorRepository;
	this.departmentRepository=departmentRepository;
	this.faqRepository=faqRepository;
}

@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	loadDoctors();
	loadDepartments();
	loadFAQ();
}

private void loadDoctors () {
	Doctor jovan= new Doctor();
	jovan.setId(1L);
	jovan.setFirstName("Walter");
	jovan.setLastName("White");
	jovan.setSpeciality("Chief Medical Oficer");
	jovan.setImage(null);
	doctorRepository.save(jovan);
	
	Doctor sara= new Doctor();
	sara.setFirstName("Sarah");
	sara.setLastName("Jhonson");
	sara.setSpeciality("Anesthesiologist");
	sara.setImage(null);
	doctorRepository.save(sara);
	
	Doctor wiliam = new Doctor();
	wiliam.setFirstName("Wiliam");
	wiliam.setLastName("Anderson");
	wiliam.setSpeciality("Cardiology");
	wiliam.setImage(null);
	doctorRepository.save(wiliam);
	
	Doctor amanda= new Doctor();
	amanda.setFirstName("Amanda");
	amanda.setLastName("Jepson");
	amanda.setSpeciality("Neurosurgeon");
	amanda.setImage(null);
	doctorRepository.save(amanda);
	 System.out.println("Data Loaded = " + doctorRepository.count() );
}

private void loadDepartments () {
	Departments cardiology=  new Departments();
	cardiology.setName("Cardiology");
	cardiology.setDescription("The cardiology team at “Medilab” consists of eminent intervention cardiologists, non-invasive cardiologists"
			+ " and cardiac electrophysiologists, providing complete treatment of all heart diseases. Interventional procedures are performed with high"
			+ " quality materials and stents produced by the most renown global manufacturers. Each patient at “Medilab” receives  individual "
			+ "treatment including expert recommendation for risk factors control as a way of efficient cardiovascular diseases prevention.");
	
	departmentRepository.save(cardiology);
	
	Departments neurology= new Departments();
	neurology.setName("Neurology");
	neurology.setDescription("Our confident team of specialists performed more than 20,000 outpatient examinations and admitted 3,000"
			+"hospitalized patients in the past 7 years. The Department of Neurology is the first in the country to  introduce thrombolytic"
			+"treatment (lysis of blood clots) in patients suffering from an acute stroke. Since 2016, the neurological team has been implementing "
			+"an intraoperative neuromonitoring in many operations in order to reduce the risk of unwanted complications and injury of nerve tissues"
			+"during surgery");
	departmentRepository.save(neurology);
	
	Departments hematology= new Departments();
	hematology.setName("Hepatology");
	hematology.setDescription("The Department of Hematology at Medilab Hospital offers diagnosis and treatment of hematological diseases in outpatient conditions and daily hospital."
			+"Examination for clinical assessment of veno-occlusive disease, identification of patients at risk of thrombosis, general approach for prevention of thrombosis, treatment and routine control of oral anticoagulant therapy.");
	departmentRepository.save(hematology);
	
	Departments pediatrics = new Departments();
	pediatrics.setName("Pediatrics");
	pediatrics.setDescription("Pediatric Hospital located within the Acibadem Sistina Hospital complex provides Hospital Ward,"
			+"Pediatric and Neonatal Outpatient Care and 24/7 Emergency Center including three intensive care units – Neonatal,"
			+"Pediatric Cardiac Surgery and Pediatric Intensive Care. Spread over an area of ​​4,000 square meters, the Hospital "
			+"includes Pediatric Cardiac Surgery with Intensive Care Unit and Interventional Pediatric Cardiology, Day Hospital,"
			+"as well as Center for Early Detection and Treatment of Children with all forms of developmental disabilities. The team"
			+"taking care of children’s health involves 210 leading professionals and 80 nurses. Considering the number of personnel,"
			+"services and treatment it offers to children, together with the leading staff of renowned doctors, as well as the most "
			+"advanced technology and equipment, the Pediatric Hospital obtains the primacy as the only and the most modern pediatric hospital of this type in the country and region.");
	departmentRepository.save(pediatrics);
	
	Departments eyeCare= new Departments();
	eyeCare.setName("Eye Care");
	eyeCare.setDescription("The Department of Ophthalmology at Medilab Hospitals aims to set benchmarks in all aspects of ophthalmic"
			+"care delivery to the patients and the public. Guidance is provided for all types of eye disorders and the services are"
			+"reviewed regularly to keep them aligned with changing demands and technology.\r\n" + 
			"\r\n" + 
			"The goal of ophthalmologists at CARE Hospitals is to eliminate the suffering caused by eye disorders, by providing the highest"
			+"quality of medical and surgical eye care for patients. The department offers the full complement of services");
	
	departmentRepository.save(eyeCare);
	
	
	System.out.println("Departments Loaded = " + doctorRepository.count() );
	
}

private void loadFAQ () {
	FAQ question1= new FAQ();
	question1.setQuestion("What are the working hours?");
	question1.setAnswer("The hospital works 24 hours a day, every day of the week. The regular outpatient clinics’ working hours are from 9:00 am to 8:00 pm."
			+ " In case you  have not made a prior appointment or if  your matter is urgent,"
			+ " you could refer to our Emergency Center for professional help "
			+ "at The Center that covers all pathologies and works 24 hours a day.");
	faqRepository.save(question1);
	
	FAQ question2= new FAQ();
	question2.setQuestion("Could I have blood tests made over the weekend?");
	question2.setAnswer("Yes. The Diagnostics Laboratories Department offers a complete range of services, while laboratory services are being provided 24/7.");
	faqRepository.save(question2);
	
	FAQ question3=new FAQ();
	question3.setQuestion("What language could I communicate with your employees in?");
	question3.setAnswer("Considering the fact that “Medilab”  admits patients from all over the region, our staff is fluent in six languages."
	+" We  employ full-time staff speaking the following languages: Macedonian, English, Turkish, Albanian,"
			+"Serbian and German. We also provide Medical documentation translation  upon request.");
	faqRepository.save(question3);
	
	FAQ question4= new FAQ();
	question4.setQuestion("Could I come for an examination without a prior appointment?");
	question4.setAnswer("The Emergency Center at “Medilab” operates 24 hours a day, offering medical services in the area "
			+ "of surgery, gynecology, internal medicine, as well as pediatrics. If however, you  would like to be examined by a particular doctor,"
			+"it is necessary to make a prior appointment with your chosen doctor.");
	faqRepository.save(question4);
	
	FAQ question5= new FAQ();
	question5.setQuestion("How much will treatment at Medilab cost?");
	question5.setAnswer("\r\n" + 
			"\r\n" + 
			"Our Call Centre provides information about the price of a particular service at the following telephone number: 02/30 99 500. “Medilab ’s” "
			+"outpatients are informed of the price in advance, before the examination is performed. In case further examinations are necessary the patient"
			+"is informed  of their type and cost. The patient is properly informed about all interventions and has the right to ask any question related to the cost of service. In case of  "
			+"surgical treatment, the patient is informed in advance about the intervention price including the length of hospitalization. In case of an excess over the predetermined price, "
			+"our Payment Department team informs the patient and the closest family members.\r\n" + 
			"\r\n" + 
			"Hospitalized patients are visited daily by an administrator who informs them  of the exact cost incurred during their hospitalization as well as of the price of all following interventions recommended by a doctor.\r\n" + 
			"");
	faqRepository.save(question5);
}

}
