package com.thirdware.guptabookstore.pojo;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data; 

@Table(name = "boughtlist")
@javax.persistence.Entity
@Data
public class Boughtlist {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sno;
	@Column(insertable=false,updatable=false)
	private Integer userid;
	@Column(insertable=false,updatable=false)
	private Integer bookid;
	private  Date boughtdate;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userid",nullable = false)
	
	private Registerform registerform;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bookid",nullable = false)
	private Booklist booklist;
	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public Date getBoughtdate() {
		return boughtdate;
	}

	public void setBoughtdate(Date boughtdate) {
		this.boughtdate = boughtdate;
	}

	
}
