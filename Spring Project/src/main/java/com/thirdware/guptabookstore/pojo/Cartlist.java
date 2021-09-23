package com.thirdware.guptabookstore.pojo;


import java.util.Date;
import java.util.Set;


import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.Data;

@Table(name = "cartlist")
@Entity
@Data
public class Cartlist {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer sno;
@Column(nullable = false,updatable=false)
	private Integer userid;
@Column(nullable = false,updatable=false)
	private Integer bookid;
private Integer quantity;
@Basic(optional = false)
@Column(name = "cartdate", insertable = false, updatable = false)
@Temporal(TemporalType.TIMESTAMP)
	private Date cartdate ;
@ManyToOne(fetch = FetchType.LAZY, optional = true)
	
	
	@JoinColumn(name="bookid",nullable = false)
@Transient
	private Booklist booklist;
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name="userid",nullable = false)
	@Transient
	private UserData userdata;
	
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	
	
	
}
