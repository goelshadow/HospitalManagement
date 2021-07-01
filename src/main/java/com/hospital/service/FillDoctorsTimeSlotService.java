package com.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.constant.DoctorConstants;
import com.hospital.entity.DoctorTimeDuration;
import com.hospital.model.FillDoctorTimeSlotRequest;
import com.hospital.model.FillDoctorTimeSlotResponse;
import com.hospital.repository.FillDoctorTimeSlotsRepository;
import com.hospital.util.DoctorsUtil;
import com.hospital.util.LoggerUtil;

@Service
public class FillDoctorsTimeSlotService {

	@Autowired
	FillDoctorTimeSlotsRepository fillDoctorTimeSlotsRepository;
	
	public FillDoctorTimeSlotResponse fillDoctorTimeSlots(FillDoctorTimeSlotRequest request) {
		
		request.getSlots().forEach(slot -> {
			DoctorTimeDuration doctorTimeDuration = populateRequest(request);
			LoggerUtil.printInfoLogs("Request to save in DB:", doctorTimeDuration, false);
			doctorTimeDuration.setSlot(slot);
			LoggerUtil.printInfoLogs("Request after adding time slot:", doctorTimeDuration, false);
			fillDoctorTimeSlotsRepository.save(doctorTimeDuration);
			LoggerUtil.printInfoLogs("Doctors time slots added in database:", doctorTimeDuration, false);
		});
		return DoctorsUtil.bildResponse(DoctorConstants.SUCCESS_CODE, DoctorConstants.SUCCESS_DESC, request.getHeader());
	}
	
	private DoctorTimeDuration populateRequest(FillDoctorTimeSlotRequest request) {
		
		DoctorTimeDuration doctorTimeDuration = new DoctorTimeDuration();
		doctorTimeDuration.setFriday(request.getFriday());
		doctorTimeDuration.setHospitalId(request.getHeader().getHospitalId());
		doctorTimeDuration.setMonday(request.getMonday());
		doctorTimeDuration.setSaturday(request.getSaturday());
		doctorTimeDuration.setStaffId(request.getStaffId());
		doctorTimeDuration.setSunday(request.getSunday());
		doctorTimeDuration.setThrusday(request.getThrusday());
		doctorTimeDuration.setTuesday(request.getTuesday());
		doctorTimeDuration.setWednesday(request.getWednesday());
		return doctorTimeDuration;
	}
}
