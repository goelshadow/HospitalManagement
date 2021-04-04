
package com.hospital.service;

import java.util.Optional;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.hospital.constant.StaffConstants;
import com.hospital.entity.Staff;
import com.hospital.helper.StaffHelper;
import com.hospital.model.RegisterOrUpdateStaffRequest;
import com.hospital.model.RegisterorUpdateStaffResponse;
import com.hospital.repository.StaffRepository;
import com.hospital.util.CommonUtil;
import com.hospital.util.LoggerUtil;
import com.hospital.util.StaffUtil;

@Component
public class RegisterOrUpdateStaffService {

	@Autowired
	StaffRepository staffRepository;

	@Autowired
	CommonUtil commonUtil;

	@Autowired
	StaffHelper staffHelper;

	public RegisterorUpdateStaffResponse registerStaff(RegisterOrUpdateStaffRequest request) {

		String generatedUserName = generateStaffId(request);
		LoggerUtil.printInfoLogs("UserName generated:", generatedUserName, false);
		if (StringUtils.isBlank(generatedUserName)) {
			return StaffUtil.buildRegisterStaffResponse(request.getHeader(), StaffConstants.FAILURE_CODE,StaffConstants.FAILURE_DESC, "");
		}
		Staff staff = staffHelper.createEntryInStaffTableRequest(request, generatedUserName);
		LoggerUtil.printInfoLogs("Request for saving staff table:", staff, false);
		staffRepository.save(staff);
		return StaffUtil.buildRegisterStaffResponse(request.getHeader(), StaffConstants.SUCCESS_CODE,StaffConstants.SUCCESS_DESC, generatedUserName);
	}

	private String generateStaffId(RegisterOrUpdateStaffRequest request) {

		String userName = "";
		for (int digit = 3; digit < 7; digit++) {
			String username = generateUserName(request, digit);
			Optional<Staff> s = staffRepository.findById(username);
			if (!s.isPresent()) {
				userName = username;
				break;
			}
		}
		return userName;
	}

	private String generateUserName(RegisterOrUpdateStaffRequest request, int randomDigit) {

		String subLastName = request.getLastName().trim();
		String subFirstName = request.getFirstName().trim();
		if (subLastName.length() > 2)
			subLastName = subLastName.substring(0, 2);
		if (subFirstName.length() > 4)
			subFirstName = subFirstName.substring(0, 4);
		String finalStaffId = subLastName + subFirstName + commonUtil.generateRandomDigit(randomDigit);
		return finalStaffId.toLowerCase();
	}

	public RegisterorUpdateStaffResponse updateStaff(RegisterOrUpdateStaffRequest request) {

		Optional<Staff> staff1 = staffRepository.findById(request.getStaffUserName());
		if (staff1.isPresent()) {
			Staff staff = staffHelper.updateEntryInStaffTableRequest(request, staff1.get());
			staffRepository.save(staff);
		}
		return StaffUtil.buildRegisterStaffResponse(request.getHeader(), StaffConstants.SUCCESS_CODE,
				StaffConstants.SUCCESS_DESC, request.getStaffUserName());
	}

}
