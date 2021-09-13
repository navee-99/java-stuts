package com.thirdware.guptabookstore.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.thirdware.guptabookstore.pojo.Registerform;

@Repository


public interface StoreDao extends JpaRepository<Registerform, Integer> {

	
}
