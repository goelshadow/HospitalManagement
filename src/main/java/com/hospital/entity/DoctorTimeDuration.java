package com.hospital.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DOCTOR_TIME_DURATION")
public class DoctorTimeDuration {

	@Id
	@Column(name = "HOSPITAL_ID")
	private String hospitalId;

	@Column(name = "STAFF_ID")
	private String staffId;

	@Column(name = "SLOT")
	private String slot;

	@Column(name = "MONDAY")
	private String monday;

	@Column(name = "TUESDAY")
	private String tuesday;

	@Column(name = "WEDNESDAY")
	private String wednesday;

	@Column(name = "THRUSDAY")
	private String thrusday;

	@Column(name = "FRIDAY")
	private String friday;

	@Column(name = "SATURDAY")
	private String saturday;

	@Column(name = "SUNDAY")
	private String sunday;

	public String getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
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
	
}
