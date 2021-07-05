package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
@Id
  private Integer bookid;
@Column
  private String name;
@Column
  private Integer price;

@Column
   private Integer pages;




@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "authorid")
  private  author author;


public author getAuthor() {
	return author;
}

public void setAuthor(author author) {
	this.author = author;
}

public Book() {}

public Book(Integer bookid, String name,Integer price ,Integer pages) {
	super();
	this.bookid = bookid;
	this.name = name;
	this.price = price;
	
	this.pages=pages;
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

public Integer getPrice() {
	return price;
}

public void setPrice(Integer price) {
	this.price = price;
}



public Integer getPages() {
	return pages;
}

public void setPages(Integer pages) {
	this.pages = pages;
}
}


