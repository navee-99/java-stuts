package com.thirdware.guptabookstore.pojo;


import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@javax.persistence.Entity

@Table(name = "booklist")
@Data
public class Booklist {
	/* @GeneratedValue(strategy = GenerationType.IDENTITY) */
	@Id
	private Integer bookid;
	

	private String bookname; 
	 private String authorname;
	 private String catagore;
	 private Integer availableStack;
	
	 private Integer price;
	 @Basic(optional = false)
		@Column(name = "addeddate", insertable = false, updatable = false)
		@Temporal(TemporalType.TIMESTAMP)
	 private Date addeddate;
	 private Integer yearpublish;
//private UserData userdata;
	
	 @OneToMany(cascade=CascadeType.ALL)
	 @JoinColumn(name = "bookid")
		private Set<Boughtlist> boughtlist;
		@OneToMany(cascade=CascadeType.ALL)
		 @JoinColumn(name = "bookid")
				private Set<Cartlist>cartlist;
		@OneToMany(cascade=CascadeType.ALL)
		 @JoinColumn(name = "bookid")
		
		private Set<Feedback>feedback;
		/*
		 * public UserData userdata() { return userdata;
		 * 
		 * }
		 */
	
	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		
		StringBuilder titleCase = new StringBuilder(bookname.length());
        boolean nextTitleCase = true;

        for (char c : bookname.toLowerCase().toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }
            titleCase.append(c);
        }

       return titleCase.toString();
		
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthorname() {
		StringBuilder titleCase = new StringBuilder(authorname.length());
        boolean nextTitleCase = true;

        for (char c : authorname.toLowerCase().toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }
            titleCase.append(c);
        }

       return titleCase.toString();
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public String getCatagore() {
		StringBuilder titleCase = new StringBuilder(catagore.length());
        boolean nextTitleCase = true;

        for (char c : catagore.toLowerCase().toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }
            titleCase.append(c);
        }

       return titleCase.toString();
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

	public Booklist() {
		
	}

	public Booklist(Integer bookid, String bookname, String authorname, String catagore, Integer availableStack,
			Integer price, Date addeddate, Integer yearpublish, Set<Boughtlist> boughtlist, Set<Cartlist> cartlist,
			Set<Feedback> feedback) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.authorname = authorname;
		this.catagore = catagore;
		this.availableStack = availableStack;
		this.price = price;
		this.addeddate = addeddate;
		this.yearpublish = yearpublish;
		this.boughtlist = boughtlist;
		this.cartlist = cartlist;
		this.feedback = feedback;
	} @Override
	public String toString() {
		return "Booklist [bookid=" + bookid + ", bookname=" + bookname + ", authorname=" + authorname + ", catagore="
				+ catagore + ", availableStack=" + availableStack + ", price=" + price + ", addeddate=" + addeddate
				+ ", yearpublish=" + yearpublish + ", boughtlist=" + boughtlist + ", cartlist=" + cartlist
				+ ", feedback=" + feedback + "]";
	}


	
}
