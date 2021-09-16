package com.thirdware.guptabookstore.pojo;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "cartlist")
@Entity
@Data
public class Cartlist {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer sno;
@Column(insertable=false,updatable=false)
	private Integer userid;
@Column(insertable=false,updatable=false)
	private Integer bookid;
	private Date cartdate ;
@ManyToOne(cascade=CascadeType.ALL)
	
	
	@JoinColumn(name="bookid",nullable = false)
	private Booklist booklist;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userid",nullable = false)
	private Registerform registerform;
	
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

	public Date getCartdate() {
		return cartdate;
	}

	public void setCartdate(Date cartdate) {
		this.cartdate = cartdate;
	}

	
	
	
}
