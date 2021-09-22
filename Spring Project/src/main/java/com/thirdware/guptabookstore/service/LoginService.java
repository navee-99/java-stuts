package com.thirdware.guptabookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thirdware.guptabookstore.dao.LoginDao;
import com.thirdware.guptabookstore.pojo.UserData;
import com.thirdware.guptabookstore.vo.Userdata;

@Service
public class LoginService {

	@Autowired
	LoginDao logindao;
	
	public String getlogindata(Userdata userdata) {
		
		UserData record=logindao.userid(userdata.getUserid());
		
		if(record==null) {
			return "register first";
		}
else if(record.getUserid().equals(userdata.getUserid())) {
	if(record.getPassword().equals(userdata.getPassword())) {
		
		if(record.getUsertype().equalsIgnoreCase("student")) {
			
			UserData data=logindao.userid(userdata.getUserid());
		
			return "Name : "+data.getName()+ "\n"+"Role : "+data.getUsertype()+ "\n"+"ID : "+data.getUserid();
		}
		else if(record.getUsertype().equalsIgnoreCase("employee")) {
			
			UserData data=logindao.userid(userdata.getUserid());
			return "Name : "+data.getName()+ "\n"+"Role : "+data.getUsertype()+ "\n"+"ID : "+data.getUserid();
		}
	}return "enter correct password" ;
		}
		else
		
		return "enter correct data";
	}
}
		
	
