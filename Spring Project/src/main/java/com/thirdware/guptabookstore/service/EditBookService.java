package com.thirdware.guptabookstore.service;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.thirdware.guptabookstore.dao.BookListDao;
import com.thirdware.guptabookstore.pojo.Booklist;
import com.thirdware.guptabookstore.vo.BooksData;

@Service
public class EditBookService {
	
	@Autowired
	
	BookListDao booklistdao;
	
	
	public String editbooklist(BooksData booksdata) {
		
		
		Booklist books=booklistdao.bookid(booksdata.getBookid());
		
		
		books.setBookname(booksdata.getBookname());
		books.setCatagore(booksdata.getCatagore());
		books.setAuthorname(booksdata.getAuthorname());
		books.setAvailableStack(booksdata.getAvailableStack());
		books.setPrice(booksdata.getPrice());
		books.setYearpublish(booksdata.getYearpublish());
		books.setAddeddate(booksdata.getAddeddate());
		if(booklistdao.save(books) != null) {
		
			return "success";
		}else {
			return "failuer";
		}
		
		
	}
}


