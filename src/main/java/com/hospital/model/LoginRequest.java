package com.hospital.model;

import java.io.Serializable;

public class LoginRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Header header;
	private String userName;
	private String pazzwrd;
	
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPazzwrd() {
		return pazzwrd;
	}
	public void setPazzwrd(String pazzwrd) {
		this.pazzwrd = pazzwrd;
	}
	@Override
	public String toString() {
		return "LoginRequest [header=" + header + ", userName=" + userName + ", pazzwrd=" + pazzwrd + "]";
	}
}
