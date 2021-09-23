package com.thirdware.guptabookstore.pojo;



import java.util.Date;
import java.util.Set;

import javax.persistence.Basic;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Table(name = "user_details")

@javax.persistence.Entity

@Data
public class UserData {
	@Id

	/*
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 */

	private Integer userid;
	private String name;
	private String password;
	@Column(name = "mobile",unique=true)
	private Integer mobile;
	private String  usertype;
	private Integer age;
	@Basic(optional = false)
	@Column(name = "registerdate", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
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

	
	public UserData(Integer userid, String name, String password, Integer mobile, String usertype, Integer age,
		Date registerdate, Set<Boughtlist> boughtlist, Set<Cartlist> cartlist, Set<Feedback> feedback) {
	super();
	this.userid = userid;
	this.name = name;
	this.password = password;
	this.mobile = mobile;
	this.usertype = usertype;
	this.age = age;
	this.registerdate = registerdate;
	this.boughtlist = boughtlist;
	this.cartlist = cartlist;
	this.feedback = feedback;
}
	@Override
public String toString() {
	return "UserData [userid=" + userid + ", name=" + name + ", password=" + password + ", mobile=" + mobile
			+ ", usertype=" + usertype + ", age=" + age + ", registerdate=" + registerdate + ", boughtlist="
			+ boughtlist + ", cartlist=" + cartlist + ", feedback=" + feedback + "]";
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

public UserData() {
	
}


}