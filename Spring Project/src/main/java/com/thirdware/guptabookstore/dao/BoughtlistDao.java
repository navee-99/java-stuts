package com.thirdware.guptabookstore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thirdware.guptabookstore.pojo.Boughtlist;
import com.thirdware.guptabookstore.vo.BoughtData;

@Repository
	public interface BoughtlistDao extends JpaRepository<Boughtlist, Integer>{

	List<Boughtlist> userid(Integer userid);

	Boughtlist bookid(Integer bookid);

		/* void saveAll(List<BoughtData> buybooks); */

		/* void save(BoughtData buybooks); */
	
		/*
		 * Boughtlist userid(int userid);
		 * 
		 * Boughtlist bookid(int bookid);
		 */
	
	
	
	
}
