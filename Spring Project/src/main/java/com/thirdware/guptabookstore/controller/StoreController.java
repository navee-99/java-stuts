package com.thirdware.guptabookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thirdware.guptabookstore.pojo.Booklist;
import com.thirdware.guptabookstore.pojo.Registerform;
import com.thirdware.guptabookstore.service.StoreService;

@RestController
public class StoreController {

	@Autowired
	
	StoreService storeService;
	@RequestMapping("/registerlist")
	public List<Registerform>  getStudentList(){
		return storeService.getStudentList();
	}
	@RequestMapping("/bookList")
	public List<Booklist>  addedbooklist(){
		return storeService.addedbooklist();
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(@RequestBody List<Registerform> registeration) {
		return storeService.register(registeration);
	}
	@RequestMapping(value="/addbook",method=RequestMethod.POST)
	public String addbook(@RequestBody List<Booklist> addedbooklist) {
		return storeService.addedbook(addedbooklist);
	}
	
	
}
