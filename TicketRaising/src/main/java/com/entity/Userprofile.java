package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.struts.action.ActionForm;

@Entity
@Table(name="userprofile")
public class Userprofile extends ActionForm{
    @Id
	private String username;
    @Column
	private String address;
    @Column
	private String mobile;
    @Column
	private String email;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "username")
	  private  Userdata userdata;

	
	public Userdata getUserdata() {
		return userdata;
	}

	public void setUserdata(Userdata userdata) {
		this.userdata = userdata;
	}
public Userprofile() {}
	public Userprofile(String username, String address, String mobile, String email, Userdata userdata) {
		super();
		this.username = username;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.userdata = userdata;
	}

	@Override
	public String toString() {
		return "userprofile [username=" + username + ", address=" + address + ", mobile=" + mobile + ", email=" + email
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
