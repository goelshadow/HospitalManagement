package com.hospital.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hospital.entity.Hospital;
import com.hospital.repository.HospitalRepository;

@RestController
public class AddHospitalController {

	@Autowired
	HospitalRepository hospitalRepository;

	@GetMapping("/addHospital")
	public String registerHospital() {
		populate();
		return "";

	}
	
	public void populate() {
		Hospital h = new Hospital();
		h.setAddress("test1");
		h.setContact("test1");
		h.setEmail("test@test.com");
		h.setHospitalId("H0002");
		h.setName("test1");
		h.setSpeciality("test1");
		System.out.println(hospitalRepository.save(h));
		List<Hospital> a = hospitalRepository.findAll();
		System.out.println(a.get(0).getHospitalId());
	}

}
