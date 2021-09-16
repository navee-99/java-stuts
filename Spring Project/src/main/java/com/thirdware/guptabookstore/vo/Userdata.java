package com.thirdware.guptabookstore.vo;

public class Userdata {

	private int userid;
	private String name;
	private String password;
	public Userdata() {
		
	}
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Userdata(int userid, String name, String password) {
		super();
		this.userid = userid;
		this.name = name;
		this.password = password;
	}
	@Override
	public String toString() {
		return "userlogin [userid=" + userid + ", name=" + name + ", password=" + password + "]";
	}
	
	
}
