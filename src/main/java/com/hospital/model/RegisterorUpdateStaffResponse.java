package com.hospital.model;

public class RegisterOrUpdateStaffResponse {
	
	private String responseCode;
	private String responseDesc;
	private Header header;
	private String staffUserName;
	
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseDesc() {
		return responseDesc;
	}
	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public String getStaffUserName() {
		return staffUserName;
	}
	public void setStaffUserName(String staffUserName) {
		this.staffUserName = staffUserName;
	}
	@Override
	public String toString() {
		return "RegisterOrUpdateStaffResponse [responseCode=" + responseCode + ", responseDesc=" + responseDesc
				+ ", header=" + header + ", staffUserName=" + staffUserName + "]";
	}
	
}
