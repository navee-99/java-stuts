package com.thirdware.guptabookstore.vo;

import java.sql.Date;

import com.thirdware.guptabookstore.pojo.Booklist;

public class BooksData {
	
	 private Integer bookid;
	 private String bookname; 
	 private String authorname;
	 private String catagore;
	 private Integer availableStack;
	
	 private Integer price;
	 private Date addeddate;
	 private Integer yearpublish;
	 
	 private String option;
	 public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public BooksData() {
		 
	 }
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
	public Date getAddeddate() {
		return addeddate;
	}
	public void setAddeddate(Date addeddate) {
		this.addeddate = addeddate;
	}
	public Integer getYearpublish() {
		return yearpublish;
	}
	public void setYearpublish(Integer yearpublish) {
		this.yearpublish = yearpublish;
	}
	@Override
	public String toString() {
		return "BooksData [bookid=" + bookid + ", bookname=" + bookname + ", authorname=" + authorname + ", catagore="
				+ catagore + ", availableStack=" + availableStack + ", price=" + price + ", addeddate=" + addeddate
				+ ", yearpublish=" + yearpublish + ", option=" + option + "]";
	}
	public BooksData(Integer bookid, String bookname, String authorname, String catagore, Integer availableStack,
			Integer price, Date addeddate, Integer yearpublish, String option) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.authorname = authorname;
		this.catagore = catagore;
		this.availableStack = availableStack;
		this.price = price;
		this.addeddate = addeddate;
		this.yearpublish = yearpublish;
		this.option = option;
	}
	
}
