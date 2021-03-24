/*
 * package com.hospital.service;
 * 
 * import java.util.List; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service; import com.google.gson.Gson; import
 * com.hospital.constant.LoginConstants; import com.hospital.entity.StaffLogin;
 * import com.hospital.model.LoginRequest; import
 * com.hospital.model.LoginResponse; import
 * com.hospital.repository.LoginRepository; import com.hospital.util.LoggerUtil;
 * import com.hospital.util.LoginUtil;
 * 
 * @Service public class LoginService {
 * 
 * @Autowired LoginRepository loginRepository;
 * 
 * @Autowired Gson gson;
 * 
 * @Autowired LoggerUtil loggerUtil;
 * 
 * public LoginResponse doLogin(LoginRequest loginRequest) {
 * 
 * List<StaffLogin> list =
 * loginRepository.findByStaffId(loginRequest.getUserName(),loginRequest.
 * getPazzwrd());
 * loggerUtil.printInfoLogs("Response from USER_LOGIN table:",list,true);
 * if(null != list && list.size() > 0) { return
 * LoginUtil.buildResponse(loginRequest.getHeader(),LoginConstants.SUCCESS_CODE,
 * LoginConstants.SUCCESS_DESC); } else { return
 * LoginUtil.buildResponse(loginRequest.getHeader(),LoginConstants.FAILURE_CODE,
 * LoginConstants.FAILURE_DESC); } } }
 */