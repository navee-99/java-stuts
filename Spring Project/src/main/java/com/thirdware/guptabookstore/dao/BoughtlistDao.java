package com.thirdware.guptabookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thirdware.guptabookstore.pojo.Boughtlist;

@Repository
	public interface BoughtlistDao extends JpaRepository<Boughtlist, Integer>{
}
