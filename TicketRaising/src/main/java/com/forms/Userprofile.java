package com.forms;

import org.apache.struts.action.ActionForm;

public class Userprofile extends ActionForm {

	private String username;
	private String address;
	private String mobile;
	private String email;
	
	
	public Userprofile() {}
	public Userprofile(String username, String address, String mobile, String email) {
		super();
		this.username = username;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Userprofile [username=" + username + ", address=" + address + ", mobile=" + mobile + ", email=" + email
				+ "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
