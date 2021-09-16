package com.thirdware.guptabookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thirdware.guptabookstore.pojo.Registerform;
@Repository
public interface LoginDao extends JpaRepository<Registerform, String> {
	
	Registerform name(String name) ;
		
	
	

}
