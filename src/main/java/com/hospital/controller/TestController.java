package com.hospital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hospital.model.Header;
import com.hospital.model.RegisterOrUpdateStaffRequest;
import com.hospital.model.RegisterorUpdateStaffResponse;

@RestController
public class TestController {
	
	
	@GetMapping(path = "/getStaff")
	public RegisterorUpdateStaffResponse registerStaff() {
		
		RestTemplate restTemplate = new RestTemplate();
		RegisterOrUpdateStaffRequest request = new RegisterOrUpdateStaffRequest();
		Header header = new Header();
		header.setChannelId("CN");
		header.setHospitalId("H0002");
		header.setTransId("TransId");
		request.setAddress("Test1");
		request.setAge(35);
		request.setEmail("email");
		request.setFirstName("MyName");
		request.setGender("M");
		request.setLastName("LastName");
		request.setMiddleName("MiddleName");
		request.setPhone("39872646137");
		request.setProfession("Doctor");
		request.setStaffId("12275");
		request.setStaffUserName("myUserName");
		request.setHeader(header);
		RegisterorUpdateStaffResponse response = restTemplate.postForObject("https://manage-hospital.azurewebsites.net/registerStaff", request, RegisterorUpdateStaffResponse.class);
		return response;
	}
	

}
