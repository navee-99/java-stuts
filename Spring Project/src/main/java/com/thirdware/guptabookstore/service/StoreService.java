package com.thirdware.guptabookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.thirdware.guptabookstore.pojo.Booklist;
import com.thirdware.guptabookstore.pojo.Registerform;
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
	
	public List<Registerform> getStudentList() {
		// TODO Auto-generated method stub
		List<Registerform> registerform=storeDao.findAll();
		return registerform;
	}
	
	
	 
	
	
	public String register(List<Registerform> registeration) {
		// TODO Auto-generated method stub
		storeDao.saveAll(registeration);
		return "Success"; 
	}
 
	public List<Booklist> addedbooklist() { 
		// TODO Auto-generated method stub
		List<Booklist> booklist=booklistdao.findAll();
		return booklist;
	}
	public String addedbook(List<Booklist> addedbooklist) {
		// TODO Auto-generated method stub
		booklistdao.saveAll(addedbooklist);
		return "Success";
	}

	public String getlogin(Userdata userdata) {
		// TODO Auto-generated method stub
		
		Registerform record=logindao.name(userdata.getName());
		if(record==null) {
			return "pls register first";
		}
else if(record.getName().equals(userdata.getName())) {
	if(record.getPassword().equals(userdata.getPassword())) {
		
		return "Hii NAVEEN" ;
	}return "enter correct password" ;
		}
		else
		
		return "enter correct data";
	}

	/*
	 * public static List<RegisterForm> getLoginList() { // TODO Auto-generated
	 * method stub List<RegisterForm> login=storeDao.getLoginList();
	 * 
	 * return login; }
	 */

}
