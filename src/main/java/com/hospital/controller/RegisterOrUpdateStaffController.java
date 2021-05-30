package com.hospital.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.constant.StaffConstants;
import com.hospital.model.RegisterOrUpdateStaffRequest;
import com.hospital.model.RegisterOrUpdateStaffResponse;
import com.hospital.service.RegisterOrUpdateStaffService;
import com.hospital.util.LoggerUtil;
import com.hospital.util.StaffUtil;

@RestController
public class RegisterOrUpdateStaffController {
	
	@Autowired
	RegisterOrUpdateStaffService registerOrUpdateStaffService;

	@PostMapping(path = "/registerStaff")
	public RegisterOrUpdateStaffResponse registerStaff(@RequestBody RegisterOrUpdateStaffRequest request) {
		
		RegisterOrUpdateStaffResponse response = null;
		try {
			LoggerUtil.printInfoLogs("Request received:", request, false);
			response = registerOrUpdateStaffService.registerStaff(request);
		} catch(Exception e) {
			LoggerUtil.printErrorLogs("Exception Occured:", e);
			response = StaffUtil.buildRegisterStaffResponse(request.getHeader(), StaffConstants.EXCEPTION_CODE, StaffConstants.EXCEPTION_DESC, "");
		}
		LoggerUtil.printInfoLogs("Response sent:", response, false);
		return response;
	}
	
	@PostMapping(path = "/updateStaff")
	public RegisterOrUpdateStaffResponse updateStaff(@RequestBody RegisterOrUpdateStaffRequest request) {
		
		RegisterOrUpdateStaffResponse response = null;
		try {
			LoggerUtil.printInfoLogs("Request received:", request, false);
			if(!StringUtils.isBlank(request.getStaffUserName())) {
//				response = registerOrUpdateStaffService.updateStaff(request);
			}else {
				return StaffUtil.buildRegisterStaffResponse(request.getHeader(), StaffConstants.FAILURE_CODE, StaffConstants.USER_NAME_EMPTY, "");
			}
		} catch(Exception e) {
			LoggerUtil.printErrorLogs("Exception Occured:", e);
			response = StaffUtil.buildRegisterStaffResponse(request.getHeader(), StaffConstants.EXCEPTION_CODE, StaffConstants.EXCEPTION_DESC, "");
		}
		LoggerUtil.printInfoLogs("Response sent:", response, false);
		return response;
	}
}
