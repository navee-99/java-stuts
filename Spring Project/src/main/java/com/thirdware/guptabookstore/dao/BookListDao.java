package com.thirdware.guptabookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thirdware.guptabookstore.pojo.Booklist;


public interface BookListDao extends JpaRepository<Booklist, Integer>{

}
