package com.hospital.util;

import org.springframework.stereotype.Component;

import com.hospital.model.Header;
import com.hospital.model.RegisterorUpdateStaffResponse;

@Component
public class StaffUtil {

	public static RegisterorUpdateStaffResponse buildRegisterStaffResponse(Header header,String respCode, String respDesc,String staffUserName) {
		
		RegisterorUpdateStaffResponse response = new RegisterorUpdateStaffResponse();
		response.setHeader(header);
		response.setResponseCode(respCode);
		response.setResponseDesc(respDesc);
		response.setStaffUserName(staffUserName);
		return response;
	}
}
