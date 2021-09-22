package com.thirdware.guptabookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thirdware.guptabookstore.dao.FeedbackDao;
import com.thirdware.guptabookstore.pojo.Feedback;
import com.thirdware.guptabookstore.vo.FeedbackVo;

@Service
public class FeedbackService {

	@Autowired
	FeedbackDao feedbackdao;

	public String addfeedback(FeedbackVo feedbackvo ) {
		// TODO Auto-generated method stub
		
		Feedback feedback=new Feedback();
		
		feedback.setUserid(feedbackvo.getUserid());
		feedback.setBookid(feedbackvo.getBookid());
		feedback.setCommand(feedbackvo.getCommand());
		feedback.setRating(feedbackvo.getRating());
		feedback.setFeedbackdate(feedbackvo.getFeedbackdate());
		feedbackdao.save(feedback);
		
		return "seccess";
	}

	public List<Feedback> feedbacks() {
		// TODO Auto-generated method stub
		List<Feedback> feedbacks=feedbackdao.findAll();
		return feedbacks;
	}
	
	
	
	
	
}
