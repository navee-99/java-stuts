package com.thirdware.guptabookstore.pojo;

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

@Table
@javax.persistence.Entity
@Data
public class Boughtlist {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sno;
	private Integer userid;

	private Integer bookid;
	@ManyToOne(cascade=CascadeType.ALL) 
	
	 
	@JoinColumn(name="bookid")
	private Set<Booklist> booklist;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userid")
	private Set<Registerform> registerform;
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

	
}
