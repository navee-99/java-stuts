package com.thirdware.guptabookstore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thirdware.guptabookstore.pojo.Feedback;

@Repository
	public interface FeedbackDao extends JpaRepository<Feedback, Integer>{

	List<Feedback> userid(Integer userid);
		
	
	
	
	}

