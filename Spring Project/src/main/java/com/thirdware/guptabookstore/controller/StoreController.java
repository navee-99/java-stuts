package com.thirdware.guptabookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.thirdware.guptabookstore.dao.FeedbackDao;
import com.thirdware.guptabookstore.pojo.Booklist;
import com.thirdware.guptabookstore.pojo.Boughtlist;
import com.thirdware.guptabookstore.pojo.Cartlist;
import com.thirdware.guptabookstore.pojo.Feedback;
import com.thirdware.guptabookstore.pojo.UserData;
import com.thirdware.guptabookstore.service.AddToCartService;
import com.thirdware.guptabookstore.service.AddbookService;
import com.thirdware.guptabookstore.service.BoughtService;
import com.thirdware.guptabookstore.service.EditBookService;
import com.thirdware.guptabookstore.service.FeedbackService;
import com.thirdware.guptabookstore.service.LoginService;
import com.thirdware.guptabookstore.service.StoreService;
import com.thirdware.guptabookstore.vo.AddToCartVo;
import com.thirdware.guptabookstore.vo.BooksData;
import com.thirdware.guptabookstore.vo.BoughtData;
import com.thirdware.guptabookstore.vo.FeedbackVo;
import com.thirdware.guptabookstore.vo.RegisterVo;
import com.thirdware.guptabookstore.vo.Userdata;

@RestController
public class StoreController {

	@Autowired

	StoreService storeService;
	/*
	 * @RequestMapping(value ="/login" ,method = RequestMethod.POST) public String
	 * getlogin(@RequestBody Userdata userdata ) { return
	 * storeService.getlogin(userdata);
	 * 
	 * }
	 */
	@Autowired
	LoginService loginservice;

	@RequestMapping(value ="/login" ,method = RequestMethod.POST)
	public String getlogindata(@RequestBody Userdata userdata ) {
		return loginservice.getlogindata(userdata);
	}



	@Autowired
	EditBookService editbookservice;
	@Scope("session")
	@RequestMapping(value ="/editbooks" ,method = RequestMethod.POST)
	public String editbooklist(@RequestBody BooksData booksdata ){


		return editbookservice.editbooklist(booksdata);

	}


	@RequestMapping("/registerlist")
	public List<UserData>  getStudentList(){
		return storeService.getStudentList();
	} 
	@RequestMapping("/bookList")
	public List<Booklist>  addedbooklist(){
		return storeService.addedbooklist();
	}



	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(@RequestBody RegisterVo registeration) {
		return storeService.register(registeration); 
	}


	@RequestMapping(value="/addbook",method=RequestMethod.POST)
	public String addbook(@RequestBody BooksData addedbooklist) {
		return storeService.addedbook(addedbooklist);
	}


	@Autowired
	BoughtService boughtservice;
	@RequestMapping("/boughtlist")
	public List<Boughtlist>  boughtlist(){ 
		return boughtservice.boughtlist();
	}



	@RequestMapping("/buybook")
	public String buybook(@RequestBody BoughtData buybooks) {
		System.out.println(buybooks.toString());
		/*
		 * boughtservice.editbooklist(buybooks); boughtservice.getlogindata(buybooks);
		 */
		return boughtservice.buybook(buybooks);

	}

	/*
	 * @RequestMapping("/boughtbooks") public List<Boughtlist> boughtbooks(){ return
	 * boughtservice.boughtbooks() ;
	 * 
	 * }
	 */
	@RequestMapping(value="/boughtbooks",method=RequestMethod.POST)
	public String boughtbooks(@RequestBody List<Boughtlist> buy) {
		return boughtservice.boughtbooks(buy);
	}
	@RequestMapping(value="/userbooks",method=RequestMethod.POST)
	public List<Boughtlist> userbooks(@RequestBody Boughtlist buy) {
		return boughtservice.userbooks(buy);
	}

	@Autowired
	AddToCartService addToCartService;

	@RequestMapping("/cartlist")
	public List<Cartlist>  cartlist(){
		return addToCartService.cartlist();
	}
	@RequestMapping(value="/addtocart",method=RequestMethod.POST)
	public String addToCart(@RequestBody AddToCartVo addcart){
		return addToCartService.addToCart(addcart);

	}
	@RequestMapping(value="/RemoveFromCart",method=RequestMethod.POST)
	public String removeFromCart(@RequestBody AddToCartVo addcart){
		return addToCartService.removeFromCart(addcart);

	}
	@RequestMapping(value="/UserCartList",method=RequestMethod.POST)
	public List<Cartlist> UserCartList(@RequestBody AddToCartVo addcart){
		return addToCartService.UserCartList(addcart);

	}

	@Autowired
	FeedbackService feedbackService;
	@RequestMapping("/feedbacks")
	public List<Feedback>  feedbacks(){
		return feedbackService.feedbacks();
	}
	@RequestMapping(value="/addfeedback",method=RequestMethod.POST)
	public String addfeedback(@RequestBody FeedbackVo feedbackVo){
		return feedbackService.addfeedback(feedbackVo);

	}
	@RequestMapping(value="/userfeedback",method=RequestMethod.POST)
	public List<Feedback> userfeedback(@RequestBody FeedbackVo feedbackVo){
		return feedbackService.userfeedback(feedbackVo);

	}
	@RequestMapping(value="/searchbybookname",method=RequestMethod.POST)
	public List<Booklist> sortbybookname(@RequestBody BooksData booksData){
		return storeService.sortbybookname(booksData);

	}
	@RequestMapping(value="/searchbyauthor",method=RequestMethod.POST)
	public List<Booklist> sortbyauthor(@RequestBody BooksData booksData){
		return storeService.sortbyauthor(booksData);

	}
	@RequestMapping(value="/searchbyprice",method=RequestMethod.POST)
	public List<Booklist> sortbyprice(@RequestBody BooksData booksData){
		return storeService.sortbyprice(booksData);

	}
	@RequestMapping(value="/searchbyyear",method=RequestMethod.POST)
	public List<Booklist> sortbyyear(@RequestBody BooksData booksData){
		return storeService.sortbyyear(booksData);

	}
	@RequestMapping(value="/searchbycategore",method=RequestMethod.POST)
	public List<Booklist> sortbycategore(@RequestBody BooksData booksData){
		return storeService.sortbycategore(booksData);

	}
}
