package com.thirdware.guptabookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thirdware.guptabookstore.pojo.Booklist;

@Repository
public interface AddbooksDao extends JpaRepository<Booklist, Integer> {

}
  