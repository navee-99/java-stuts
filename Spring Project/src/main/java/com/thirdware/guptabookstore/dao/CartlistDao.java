package com.thirdware.guptabookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thirdware.guptabookstore.pojo.Cartlist;

@Repository
	public interface CartlistDao extends JpaRepository<Cartlist, Integer>{
		
	
}
