package com.thirdware.guptabookstore.pojo;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data; 

@Table(name = "boughtlist")
@javax.persistence.Entity
@Data
public class Boughtlist {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sno;
	@Column(updatable=false,nullable = false)
	private Integer userid;
	@Column(updatable=false,nullable = false)
	private Integer bookid;
	private  Date boughtdate;
	@ManyToOne(fetch = FetchType.LAZY, optional = true)

	@JoinColumn(name="userid",nullable = false)
	@Transient
	private UserData userdata;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)

	@JoinColumn(name="bookid",nullable = false)
	@Transient
	private Booklist booklist;
	@Override
	public String toString() {
		return "Boughtlist [sno=" + sno + ", userid=" + userid + ", bookid=" + bookid + ", boughtdate=" + boughtdate
				+ ", userdata=" + userdata + ", booklist=" + booklist + "]";
	}
public Booklist booklist() {
	return booklist;
	
}

/*
 * public UserData userdata() { return userdata;
 * 
 * }
 */
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
