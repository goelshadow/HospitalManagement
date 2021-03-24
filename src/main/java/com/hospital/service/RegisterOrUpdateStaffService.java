/*
 * package com.hospital.service;
 * 
 * import java.util.Optional; import org.apache.commons.lang3.StringUtils;
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Component; import
 * com.hospital.constant.StaffConstants; import com.hospital.entity.Staff;
 * import com.hospital.helper.StaffHelper; import
 * com.hospital.model.RegisterOrUpdateStaffRequest; import
 * com.hospital.model.RegisterorUpdateStaffResponse; import
 * com.hospital.repository.StaffRepository; import com.hospital.util.CommonUtil;
 * import com.hospital.util.LoggerUtil; import com.hospital.util.StaffUtil;
 * 
 * @Component public class RegisterOrUpdateStaffService {
 * 
 * @Autowired StaffRepository staffRepository;
 * 
 * @Autowired CommonUtil commonUtil;
 * 
 * @Autowired StaffHelper staffHelper;
 * 
 * public RegisterorUpdateStaffResponse
 * registerStaff(RegisterOrUpdateStaffRequest request) {
 * 
 * String generatedStaffId = generateStaffId(request);
 * LoggerUtil.printInfoLogs("StaffId generated:", generatedStaffId, false);
 * if(StringUtils.isBlank(generatedStaffId)) { return
 * StaffUtil.buildRegisterStaffResponse(request.getHeader(),
 * StaffConstants.FAILURE_CODE, StaffConstants.FAILURE_DESC, ""); } Staff staff
 * = staffHelper.createEntryInStaffTableRequest(request,generatedStaffId);
 * LoggerUtil.printInfoLogs("Request for saving staff table:", staff, false);
 * staffRepository.save(staff); return
 * StaffUtil.buildRegisterStaffResponse(request.getHeader(),
 * StaffConstants.SUCCESS_CODE, StaffConstants.SUCCESS_DESC, generatedStaffId);
 * }
 * 
 * private String generateStaffId(RegisterOrUpdateStaffRequest request) {
 * 
 * String staffId = ""; for(int digit=3;digit<7;digit++) { String id =
 * generateStaffId(request,digit); Optional<Staff> s =
 * staffRepository.findById(id); if(!s.isPresent()) { staffId = id; break; } }
 * return staffId; }
 * 
 * private String generateStaffId(RegisterOrUpdateStaffRequest request,int
 * randomDigit) {
 * 
 * String subLastName = request.getLastName().trim(); String subFirstName =
 * request.getFirstName().trim(); if(subLastName.length() > 4) subLastName =
 * subLastName.substring(0,4); if(subFirstName.length() > 2) subFirstName =
 * subFirstName.substring(0,2); String finalStaffId =
 * subLastName+subFirstName+commonUtil.generateRandomDigit(randomDigit); return
 * finalStaffId.toLowerCase(); }
 * 
 * public RegisterorUpdateStaffResponse updateStaff(RegisterOrUpdateStaffRequest
 * request){
 * 
 * Optional<Staff> staff1 =
 * staffRepository.findById(request.getStaffUserName()); if(staff1.isPresent())
 * { Staff staff =
 * staffHelper.updateEntryInStaffTableRequest(request,staff1.get());
 * staffRepository.save(staff); } return
 * StaffUtil.buildRegisterStaffResponse(request.getHeader(),
 * StaffConstants.SUCCESS_CODE, StaffConstants.SUCCESS_DESC,
 * request.getStaffUserName()); }
 * 
 * }
 */