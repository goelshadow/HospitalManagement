/*
 * package com.hospital.helper;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.hospital.constant.StaffConstants; import
 * com.hospital.entity.Staff; import
 * com.hospital.model.RegisterOrUpdateStaffRequest; import
 * com.hospital.util.CommonUtil;
 * 
 * @Service public class StaffHelper {
 * 
 * @Autowired CommonUtil commonUtil;
 * 
 * public Staff createEntryInStaffTableRequest(RegisterOrUpdateStaffRequest
 * request,String generatedStaffId) {
 * 
 * Staff staff = new Staff(); staff.setStaffId(generatedStaffId);
 * staff.setHospitalId(request.getHeader().getHospitalId());
 * staff.setFirstName(request.getFirstName());
 * staff.setMiddleName(request.getMiddleName());
 * staff.setLastName(request.getLastName()); staff.setAge(request.getAge());
 * staff.setGender(request.getGender()); staff.setPhone(request.getPhone());
 * staff.setEmail(request.getEmail());
 * staff.setProfession(request.getProfession());
 * staff.setAddress(request.getAddress());
 * staff.setCreatedOn(commonUtil.getTodaysDate());
 * staff.setCreatedBy(StaffConstants.REGISTER_STAFF_SERVICE_NAME);
 * staff.setLastUpdatedOn(commonUtil.getTodaysDate());
 * staff.setLastUpdatedBy(StaffConstants.REGISTER_STAFF_SERVICE_NAME); return
 * staff; }
 * 
 * public Staff updateEntryInStaffTableRequest(RegisterOrUpdateStaffRequest
 * request,Staff staff) {
 * 
 * staff.setStaffId(request.getStaffUserName());
 * staff.setHospitalId(request.getHeader().getHospitalId());
 * staff.setFirstName(request.getFirstName());
 * staff.setMiddleName(request.getMiddleName());
 * staff.setLastName(request.getLastName()); staff.setAge(request.getAge());
 * staff.setGender(request.getGender()); staff.setPhone(request.getPhone());
 * staff.setEmail(request.getEmail());
 * staff.setProfession(request.getProfession());
 * staff.setAddress(request.getAddress());
 * staff.setLastUpdatedOn(commonUtil.getTodaysDate());
 * staff.setLastUpdatedBy(StaffConstants.UPDATE_STAFF_SERVICE_NAME); return
 * staff; } }
 */