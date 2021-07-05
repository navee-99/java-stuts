package com.form;
import org.apache.struts.action.ActionForm;

import com.entity.author;
import com.entity.Book;

public class LaibrariesForm extends ActionForm {
	private Book book;
	private author author;
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public author getAuthor() {
		return author;
	}
	public void setAuthor(author author) {
		this.author = author;
	}
	
}