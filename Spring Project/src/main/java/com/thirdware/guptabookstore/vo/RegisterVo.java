package com.thirdware.guptabookstore.vo;

import java.sql.Date;

public class RegisterVo {

	
	private Integer userid;
	private String name;
	private String password;

	private Integer mobile;
	private String  usertype;
	private Integer age;
	private Date registerdate;
	 public RegisterVo() {
		 
	 }
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getName() {
		StringBuilder titleCase = new StringBuilder(name.length());
        boolean nextTitleCase = true;

        for (char c : name.toLowerCase().toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }
            titleCase.append(c);
        }

       return titleCase.toString();
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
		StringBuilder titleCase = new StringBuilder(usertype.length());
        boolean nextTitleCase = true;

        for (char c : usertype.toLowerCase().toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }
            titleCase.append(c);
        }

       return titleCase.toString();
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
	@Override
	public String toString() {
		return "RegisterVo [userid=" + userid + ", name=" + name + ", password=" + password + ", mobile=" + mobile
				+ ", usertype=" + usertype + ", age=" + age + ", registerdate=" + registerdate + "]";
	}
	public RegisterVo(Integer userid, String name, String password, Integer mobile, String usertype, Integer age,
			Date registerdate) {
		super();
		this.userid = userid;
		this.name = name;
		this.password = password;
		this.mobile = mobile;
		this.usertype = usertype;
		this.age = age;
		this.registerdate = registerdate;
	}
	
}
