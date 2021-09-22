package com.thirdware.guptabookstore.service;

import java.io.ObjectInputStream.GetField;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thirdware.guptabookstore.dao.BookListDao;
import com.thirdware.guptabookstore.dao.BoughtlistDao;
import com.thirdware.guptabookstore.dao.CartlistDao;
import com.thirdware.guptabookstore.dao.LoginDao;
import com.thirdware.guptabookstore.pojo.Booklist;
import com.thirdware.guptabookstore.pojo.Boughtlist;
import com.thirdware.guptabookstore.pojo.Cartlist;
import com.thirdware.guptabookstore.pojo.UserData;
import com.thirdware.guptabookstore.vo.BooksData;
import com.thirdware.guptabookstore.vo.BoughtData;
import com.thirdware.guptabookstore.vo.Userdata;

@Service
public class BoughtService {

	@Autowired
	BoughtlistDao boughtlistdao;

	@Autowired
	LoginDao logindao;

	
	@Autowired
	BookListDao booklistdao;
	@Autowired
	CartlistDao cartlistDao;
	public String buybook(BoughtData buybooks) {
		// TODO Auto-generated method stub

		
		/*
		 * BoughtService boughtservice = new BoughtService(); BoughtService bou = new
		 * BoughtService(); boughtservice.editbooklist(buybooks);
		 * bou.getlogindata(buybooks);
		 */
		Booklist books=booklistdao.bookid(buybooks.getBookid());
		
int 	stack =	books.getAvailableStack();
		if (stack >=1) {
			
		
		  System.out.println("      buybooks "+buybooks.toString());
		   Boughtlist bought = new
		  Boughtlist();
		 
		bought.setUserid(buybooks.getUserid());
		
		bought.setBoughtdate(buybooks.getBoughtdate());
		
		bought.setBookid(buybooks.getBookid());
		
		boughtlistdao.save(bought);
           
		stack--;
		books.setAvailableStack(stack);
		booklistdao.save(books);
		
		Cartlist cart=cartlistDao.bookid(buybooks.getBookid());
		
		if(cart.getBookid().equals(buybooks.getBookid())) {
			cartlistDao.delete(cart);
			
		}
		return "success";

	}else {
		return "stack not available";
	}
	}
	public String boughtbooks(List<Boughtlist> buy) {
		// TODO Auto-generated method stub
		boughtlistdao.saveAll(buy);
		return "success";
	}

	public List<Boughtlist> boughtlist() {
		// TODO Auto-generated method stub
		
		List<Boughtlist> buylist=boughtlistdao.findAll();
		return buylist;
		
	}

}
