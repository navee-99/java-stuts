package com.thirdware.guptabookstore.pojo;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@javax.persistence.Entity

@Table(name = "booklist")
@Data
public class Booklist {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id



	 private Integer bookid;
	 private String bookname; 
	 private String authorname;
	 private String catagore;
	 private Integer availableStack;
	
	 private Integer price;
	 private Date addeddate;
	 private Integer yearpublish;
	
	
	 @OneToMany(cascade=CascadeType.ALL)
	 @JoinColumn(name = "bookid")
		private Set<Boughtlist> boughtlist;
		@OneToMany(cascade=CascadeType.ALL)
		 @JoinColumn(name = "bookid")
				private Set<Cartlist>cartlist;
		@OneToMany(cascade=CascadeType.ALL)
		 @JoinColumn(name = "bookid")
		
		private Set<Feedback>feedback;
	
	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public String getCatagore() {
		return catagore;
	}

	public void setCatagore(String catagore) {
		this.catagore = catagore;
	}

	public Integer getAvailableStack() {
		return availableStack;
	}

	public void setAvailableStack(Integer availableStack) {
		this.availableStack = availableStack;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getYearpublish() {
		return yearpublish;
	}

	public void setYearpublish(Integer yearpublish) { 
		this.yearpublish = yearpublish;
	}

	public Date getAddeddate() {
		return addeddate;
	}

	public void setAddeddate(Date addeddate) {
		this.addeddate = addeddate;
	}

	


	
}
