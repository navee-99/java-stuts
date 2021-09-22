package com.thirdware.guptabookstore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thirdware.guptabookstore.pojo.Booklist;
import com.thirdware.guptabookstore.vo.BoughtData;

@Repository
public interface BookListDao extends JpaRepository<Booklist, Integer>{
	
	Booklist bookid(int bookid);

	void save(List<BoughtData> boughtData);

	List<Booklist> bookname(String bookname);

	List<Booklist> authorname(String authorname);

	List<Booklist> price(Integer price);

	List<Booklist> yearpublish(Integer price);

	List<Booklist> catagore(String catagore);

	

}
