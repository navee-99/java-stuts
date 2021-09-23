package com.thirdware.guptabookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.thirdware.guptabookstore.pojo.Booklist;
import com.thirdware.guptabookstore.pojo.UserData;
import com.thirdware.guptabookstore.vo.BooksData;
import com.thirdware.guptabookstore.vo.RegisterVo;
import com.thirdware.guptabookstore.vo.Userdata;
import com.thirdware.guptabookstore.dao.BookListDao;
import com.thirdware.guptabookstore.dao.BoughtlistDao;
import com.thirdware.guptabookstore.dao.LoginDao;
import com.thirdware.guptabookstore.dao.StoreDao;
@Service
public class StoreService {

	@Autowired
	

	StoreDao storeDao;
	@Autowired
	BookListDao booklistdao;
	@Autowired
	BoughtlistDao boughtlistdao;
	@Autowired
	LoginDao logindao;
	
	public List<UserData> getStudentList() {
		// TODO Auto-generated method stub
		List<UserData> registerform=storeDao.findAll();
		return registerform;
	}
	
	
	 
	
	
	public String register(RegisterVo registeration) {
		// TODO Auto-generated method stub
		
		UserData data=storeDao.userid(registeration.getUserid());
		UserData number=storeDao.mobile(registeration.getMobile());
		if(data==null){
			if(number==null) {
				UserData add=new UserData();
				add.setUserid(registeration.getUserid());
				add.setName(registeration.getName());
				add.setPassword(registeration.getPassword());
				add.setUsertype(registeration.getUsertype());
				add.setRegisterdate(registeration.getRegisterdate());
				add.setAge(registeration.getAge());
				add.setMobile(registeration.getMobile());
		storeDao.save(add);
		
		return "Success"; 
			}return registeration.getMobile()+"   this mobile number is allready registered";
		}else {
			return registeration.getUserid()+ "  this ID is allready register";
		}
	}
 
	public List<Booklist> addedbooklist() { 
		// TODO Auto-generated method stub
		List<Booklist> booklist=booklistdao.findAll();
		return booklist;
	}
	public String addedbook(BooksData addedbooklist) {
		// TODO Auto-generated method stub
		
		Booklist add=new Booklist();
		
		add.setBookid(addedbooklist.getBookid());
		add.setBookname(addedbooklist.getBookname());
		add.setAuthorname(addedbooklist.getAuthorname());
		add.setAvailableStack(addedbooklist.getAvailableStack());
		add.setCatagore(addedbooklist.getCatagore());
		add.setPrice(addedbooklist.getPrice());
		add.setYearpublish(addedbooklist.getYearpublish());
		booklistdao.save(add);
		return "Success";
	}





	public List<Booklist> sortbybookname(BooksData booksData) {
		// TODO Auto-generated method stub
		
		
		List<Booklist> search=booklistdao.bookname(booksData.getBookname());
		return search;
	}





	public List<Booklist> sortbyauthor(BooksData booksData) {
		// TODO Auto-generated method stub
		List<Booklist> search=booklistdao.authorname(booksData.getAuthorname());
		return search;
	}





	public List<Booklist> sortbyprice(BooksData booksData) {
		// TODO Auto-generated method stub
		List<Booklist> search=booklistdao.price(booksData.getPrice());
		return search;
	}





	public List<Booklist> sortbyyear(BooksData booksData) {
		// TODO Auto-generated method stub
		List<Booklist> search=booklistdao.yearpublish(booksData.getPrice());
		return search;
	}





	public List<Booklist> sortbycategore(BooksData booksData) {
		// TODO Auto-generated method stub
		List<Booklist> search=booklistdao.catagore(booksData.getCatagore());
		return search;
	}
	

	/*
	 * public String getlogin(Userdata userdata) { // TODO Auto-generated method
	 * stub
	 * 
	 * Registerform record=logindao.name(userdata.getName()); if(record==null) {
	 * return "no data"; } else if(record.getName().equals(userdata.getName())) {
	 * if(record.getPassword().equals(userdata.getPassword())) {
	 * 
	 * if(record.getUsertype().equalsIgnoreCase("student")) {
	 * 
	 * return "Student" ; } else { return "employee"; } }return
	 * "enter correct password" ; } else
	 * 
	 * return "enter correct data"; }
	 */

	/*
	 * public static List<RegisterForm> getLoginList() { // TODO Auto-generated
	 * method stub List<RegisterForm> login=storeDao.getLoginList();
	 * 
	 * return login; }
	 */

}
