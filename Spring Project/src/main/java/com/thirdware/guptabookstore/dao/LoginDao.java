package com.thirdware.guptabookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thirdware.guptabookstore.pojo.UserData;
@Repository
public interface LoginDao extends JpaRepository<UserData, String> {
	
	UserData name(String name) ;

	UserData userid(int userid);
		
	
	

}
