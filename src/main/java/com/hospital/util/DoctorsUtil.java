package com.hospital.util;

import com.hospital.model.FillDoctorTimeSlotResponse;
import com.hospital.model.Header;

public class DoctorsUtil {
	
	public static FillDoctorTimeSlotResponse bildResponse(String responseCode, String responseDesc, Header header) {
		
		FillDoctorTimeSlotResponse response = new FillDoctorTimeSlotResponse();
		response.setHeader(header);
		response.setResponseCode(responseCode);
		response.setResponseDesc(responseDesc);
		return response;
	}

}
