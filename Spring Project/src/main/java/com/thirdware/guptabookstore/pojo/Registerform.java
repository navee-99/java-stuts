package com.thirdware.guptabookstore.pojo;


import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.SequenceGenerators;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Table(name = "registerform")

@javax.persistence.Entity

@Data
public class Registerform {
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)


	private Integer userid;
	private String name;
	private String password;
	@Column(name = "mobile",unique=true)
	private Integer mobile;
	private String  usertype;
	private Integer age;
	private Date registerdate;
	
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name = "userid")
	private Set<Boughtlist> boughtlist;
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name = "userid")
private Set<Cartlist>cartlist;
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name = "userid")
private Set<Feedback>feedback;

	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
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
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getRegisterdate() {
		return registerdate;
	}
	public void setRegisterdate(Date registerdate) {
		this.registerdate = registerdate;
	}




}