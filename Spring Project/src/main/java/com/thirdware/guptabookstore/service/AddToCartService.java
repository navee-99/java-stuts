package com.thirdware.guptabookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thirdware.guptabookstore.dao.BookListDao;
import com.thirdware.guptabookstore.dao.CartlistDao;
import com.thirdware.guptabookstore.pojo.Booklist;
import com.thirdware.guptabookstore.pojo.Cartlist;
import com.thirdware.guptabookstore.vo.AddToCartVo;

@Service
public class AddToCartService {

	
	
	@Autowired
	CartlistDao cartlistdao;
	@Autowired
 BookListDao booklistdao;
	public String addToCart(AddToCartVo addcart) {
		// TODO Auto-generated method stub
		
		Cartlist  check=cartlistdao.bookid(addcart.getBookid());
		Booklist books=booklistdao.bookid(addcart.getBookid());
		if(books.getAvailableStack() != 0) {
		if(check==null) {
		 Cartlist cart = new Cartlist();
		 
		 cart.setBookid(addcart.getBookid());
		 cart.setUserid(addcart.getUserid());
		 cart.setCartdate(addcart.getCartdate());
		cartlistdao.save(cart);
		
		
	}else {
		return "alredy available";
	}
		return "success";
	}else {
		return "stack not available";
	}
	}
	public List<Cartlist> cartlist() {
		// TODO Auto-generated method stub
		
		List<Cartlist> cartlist=cartlistdao.findAll();
		return cartlist;
	}
	
	
	
	
	
	
	
}
