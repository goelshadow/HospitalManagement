package com.hospital.model;

public class FillDoctorTimeSlotResponse {
	
	private String responseCode;
	private String responseDesc;
	private Header header;
	
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
	@Override
	public String toString() {
		return "FillDoctorTimeSlotResponse [responseCode=" + responseCode + ", responseDesc=" + responseDesc
				+ ", header=" + header + "]";
	}

}
