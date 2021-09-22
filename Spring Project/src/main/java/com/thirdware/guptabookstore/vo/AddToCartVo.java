package com.thirdware.guptabookstore.vo;

import java.sql.Date;

public class AddToCartVo {
	
	
	public AddToCartVo() {
		
	}
	private Long sno;
	private Integer userid;
	private Integer bookid;
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
	public AddToCartVo(Long sno, Integer userid, Integer bookid, Date cartdate) {
		super();
		this.sno = sno;
		this.userid = userid;
		this.bookid = bookid;
		this.cartdate = cartdate;
	}
	@Override
	public String toString() {
		return "AddToCartVo [sno=" + sno + ", userid=" + userid + ", bookid=" + bookid + ", cartdate=" + cartdate + "]";
	}

}
