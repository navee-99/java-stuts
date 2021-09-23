package com.thirdware.guptabookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thirdware.guptabookstore.dao.BoughtlistDao;
import com.thirdware.guptabookstore.dao.FeedbackDao;
import com.thirdware.guptabookstore.dao.StoreDao;
import com.thirdware.guptabookstore.pojo.Boughtlist;
import com.thirdware.guptabookstore.pojo.Feedback;
import com.thirdware.guptabookstore.pojo.UserData;
import com.thirdware.guptabookstore.vo.FeedbackVo;

@Service
public class FeedbackService {

	@Autowired
	FeedbackDao feedbackdao;
	@Autowired
	BoughtlistDao boughtlistDao;
	@Autowired
	StoreDao storeDao;

	public String addfeedback(FeedbackVo feedbackvo ) {
		// TODO Auto-generated method stub
		Boughtlist record=boughtlistDao.bookid(feedbackvo.getBookid());
		UserData data=storeDao.userid(feedbackvo.getUserid());
		Feedback feedback=new Feedback();
		
		feedback.setUserid(feedbackvo.getUserid());
		feedback.setBookid(feedbackvo.getBookid());
		feedback.setCommand(feedbackvo.getCommand());
		feedback.setRating(feedbackvo.getRating());
		feedback.setFeedbackdate(feedbackvo.getFeedbackdate());
		if(record != null) {
		feedbackdao.save(feedback);
		return "FEED BACKS"+"\n"+"UserID : "+data.getUserid() +"Book ID : "+feedbackvo.getBookid()+"Ratings : "+feedbackvo.getRating()+"Command : "+feedbackvo.getCommand();

		}else {
			return feedbackvo.getBookid()+"  BUY THIS BOOK ";
		}
	}

	public List<Feedback> feedbacks() {
		// TODO Auto-generated method stub
		List<Feedback> feedbacks=feedbackdao.findAll();
		return feedbacks;
	}

	public List<Feedback> userfeedback(FeedbackVo feedbackVo) {
		// TODO Auto-generated method stub
		List<Feedback> feedbacks=feedbackdao.userid(feedbackVo.getUserid());
		return feedbacks;
		
	
	}
	
	
	
	
	
}
