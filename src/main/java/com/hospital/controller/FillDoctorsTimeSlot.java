package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.constant.DoctorConstants;
import com.hospital.model.FillDoctorTimeSlotRequest;
import com.hospital.model.FillDoctorTimeSlotResponse;
import com.hospital.service.FillDoctorsTimeSlotService;
import com.hospital.util.DoctorsUtil;
import com.hospital.util.LoggerUtil;

@RestController
public class FillDoctorsTimeSlot {

	@Autowired
	FillDoctorsTimeSlotService fillDoctorsTimeSlotService;

	@PostMapping(path = "/fillTimeSlots")
	public FillDoctorTimeSlotResponse fillDoctorTimeSlots(@RequestBody FillDoctorTimeSlotRequest request) {

		FillDoctorTimeSlotResponse response = null;
		try {
			LoggerUtil.printInfoLogs("Doctor time slot request received:", request, false);
			response = fillDoctorsTimeSlotService.fillDoctorTimeSlots(request);
		} catch (Exception e) {
			DoctorsUtil.bildResponse(DoctorConstants.EXCEPTION_CODE, DoctorConstants.EXCEPTION_DESC, request.getHeader());
			LoggerUtil.printErrorLogs("Exception Occured:", e);
		}
		LoggerUtil.printInfoLogs("Doctor time slot response send:", response, false);
		return response;
	}

}
