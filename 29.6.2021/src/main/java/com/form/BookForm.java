package com.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.entity.author;

public class BookForm extends ActionForm {
	 private Integer bookid;
	  private String name;
	  private Integer pages;
	  private List<author> authorid;
	  private Integer price;
	  private Integer bookno;
	  
	  public BookForm() {}
	  
	@Override
	public String toString() {
		return "BookForm [bookid=" + bookid + ", name=" + name + ", pages=" + pages + ", authorid=" + authorid
				+ ", price=" + price + ", bookno=" + bookno + "]";
	}

	
	public BookForm(Integer bookid, String name, Integer pages ,Integer price) {
		super();
		this.bookid = bookid;
		this.name = name;
		this.pages = pages;
		this.price = price;
	
	}

	public Integer getBookno() {
		return bookno;
	}

	public void setBookno(Integer bookno) {
		this.bookno = bookno;
	}

	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public List<author> getAuthorid() {
		return authorid;
	}
	public void setAuthorid(List<author> authorid) {
		this.authorid = authorid;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}

}
