package com.thirdware.guptabookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thirdware.guptabookstore.dao.BookListDao;
import com.thirdware.guptabookstore.dao.CartlistDao;
import com.thirdware.guptabookstore.dao.StoreDao;
import com.thirdware.guptabookstore.pojo.Booklist;
import com.thirdware.guptabookstore.pojo.Cartlist;
import com.thirdware.guptabookstore.pojo.UserData;
import com.thirdware.guptabookstore.vo.AddToCartVo;
import com.thirdware.guptabookstore.vo.Userdata;

@Service
public class AddToCartService {

	@Autowired
	StoreDao storeDao;

	@Autowired
	CartlistDao cartlistdao;
	@Autowired
	BookListDao booklistdao;
	public String addToCart(AddToCartVo addcart) {
		// TODO Auto-generated method stub

		Cartlist  check=cartlistdao.bookid(addcart.getBookid());
		Booklist books=booklistdao.bookid(addcart.getBookid());
		UserData users=storeDao.userid(addcart.getUserid());
		/*
		 * int availablebook=books.getAvailableStack(); int
		 * bookswant=check.getQuantity(); int cal=( availablebook- bookswant);
		 */

if(books !=null) {
		if(books.getAvailableStack() != 0 ) {


			if(check==null) {
				Cartlist cart = new Cartlist();

				cart.setBookid(addcart.getBookid());
				cart.setUserid(addcart.getUserid());
				cart.setQuantity(addcart.getQuantity());
				/* cart.setCartdate(addcart.getCartdate()); */
				if(books.getAvailableStack() >=addcart.getQuantity()) {

					cartlistdao.save(cart);
				}else {
					return books.getAvailableStack()+"  books are available";
				}

			}else {
				return "alredy available";
			}
			return "Books are added to Cart"+"\n"+"userid : "+addcart.getUserid()+"\n"+"name : "+users.getName()+"\n"+"bookname : "+books.getBookname();
		}else {
			return "books  not available";
		}
}return "this book ID is not valid";
	}
	public List<Cartlist> cartlist() {
		// TODO Auto-generated method stub

		List<Cartlist> cartlist=cartlistdao.findAll();
		return cartlist;
	}
	public String removeFromCart(AddToCartVo addcart) {
		// TODO Auto-generated method stub
		Cartlist cart=cartlistdao.bookid(addcart.getBookid());
		if(cart==null) {
			return "there is no cart list for this book";
		}else {
			cartlistdao.delete(cart);
			return "removed";
		}


	}
	public List<Cartlist> UserCartList(AddToCartVo addcart) {
		// TODO Auto-generated method stub

		List<Cartlist> cartlist=cartlistdao.userid(addcart.getUserid());


		return cartlist;

	}







}
