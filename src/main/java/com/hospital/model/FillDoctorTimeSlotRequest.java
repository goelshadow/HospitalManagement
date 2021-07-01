package com.hospital.model;

import java.io.Serializable;
import java.util.List;

public class FillDoctorTimeSlotRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Header header;
	private String staffId;
	private List<String> slots;
	private String monday;
	private String tuesday;
	private String wednesday;
	private String thrusday;
	private String friday;
	private String saturday;
	private String sunday;
	
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public List<String> getSlots() {
		return slots;
	}
	public void setSlots(List<String> slots) {
		this.slots = slots;
	}
	public String getMonday() {
		return monday;
	}
	public void setMonday(String monday) {
		this.monday = monday;
	}
	public String getTuesday() {
		return tuesday;
	}
	public void setTuesday(String tuesday) {
		this.tuesday = tuesday;
	}
	public String getWednesday() {
		return wednesday;
	}
	public void setWednesday(String wednesday) {
		this.wednesday = wednesday;
	}
	public String getThrusday() {
		return thrusday;
	}
	public void setThrusday(String thrusday) {
		this.thrusday = thrusday;
	}
	public String getFriday() {
		return friday;
	}
	public void setFriday(String friday) {
		this.friday = friday;
	}
	public String getSaturday() {
		return saturday;
	}
	public void setSaturday(String saturday) {
		this.saturday = saturday;
	}
	public String getSunday() {
		return sunday;
	}
	public void setSunday(String sunday) {
		this.sunday = sunday;
	}
	@Override
	public String toString() {
		return "FillDoctorTimeSlotRequest [header=" + header + ", staffId=" + staffId + ", slots=" + slots + ", monday="
				+ monday + ", tuesday=" + tuesday + ", wednesday=" + wednesday + ", thrusday=" + thrusday + ", friday="
				+ friday + ", saturday=" + saturday + ", sunday=" + sunday + "]";
	}
	
}
