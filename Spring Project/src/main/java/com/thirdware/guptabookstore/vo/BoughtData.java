package com.thirdware.guptabookstore.vo;

import java.sql.Date;

public class BoughtData {

	private Long sno;
	private Integer userid;
	private Integer bookid;
	private Date boughtdate;
	private Integer quantity;
	public BoughtData() {
		
	}
	public Integer getUserid() {
		System.out.println(userid);
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getBookid() {
		System.out.println(bookid);
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public Date getBoughtdate() {
		System.out.println(boughtdate);
		return boughtdate;
	}
	public void setBoughtdate(Date boughtdate) {
		this.boughtdate = boughtdate;
	}
	
	
	public BoughtData(Long sno, Integer userid, Integer bookid, Date boughtdate, Integer quantity) {
		super();
		this.sno = sno;
		this.userid = userid;
		this.bookid = bookid;
		this.boughtdate = boughtdate;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "BoughtData [sno=" + sno + ", userid=" + userid + ", bookid=" + bookid + ", boughtdate=" + boughtdate
				+ ", quantity=" + quantity + "]";
	}
	public Long getSno() {
		return sno;
	}
	public void setSno(Long sno) {
		this.sno = sno;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
