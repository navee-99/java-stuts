package com.thirdware.guptabookstore.vo;

import java.sql.Date;

public class AddToCartVo {
	
	
	public AddToCartVo() {
		
	}
	private Long sno;
	private Integer userid;
	private Integer bookid;
	private Integer quantity;
	private Date cartdate;
	public Date getCartdate() {
		return cartdate;
	}
	public Long getSno() {
		return sno;
	}
	public void setSno(Long sno) {
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
	public void setCartdate(Date cartdate) {
		this.cartdate = cartdate;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "AddToCartVo [sno=" + sno + ", userid=" + userid + ", bookid=" + bookid + ", quantity=" + quantity
				+ ", cartdate=" + cartdate + "]";
	}
	public AddToCartVo(Long sno, Integer userid, Integer bookid, Integer quantity, Date cartdate) {
		super();
		this.sno = sno;
		this.userid = userid;
		this.bookid = bookid;
		this.quantity = quantity;
		this.cartdate = cartdate;
	}

}
