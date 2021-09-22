package com.thirdware.guptabookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thirdware.guptabookstore.dao.AddbooksDao;
import com.thirdware.guptabookstore.dao.BookListDao;
import com.thirdware.guptabookstore.pojo.Booklist;
import com.thirdware.guptabookstore.vo.BoughtData;

@Service
public class AddbookService {

	
	
	

@Autowired

AddbooksDao addbooksDao;
	public String addbooks(List<Booklist> boughtData) {
		// TODO Auto-generated method stub
		addbooksDao.saveAll(boughtData);
		
		return "success";
	}
	
	
}
