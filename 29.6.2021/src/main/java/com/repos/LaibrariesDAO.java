package com.repos;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.entity.Book;

import com.entity.author;

public class LaibrariesDAO {
	 private static EntityManager em=JPARepository.getEntityManager();

	  public static List<author> getAuthor() {
		  Query q =em.createQuery("Select p from author p");  //JPQL
		  List<author> l=q.getResultList();
		  return l;
	  }
	  public static boolean addBook(Book p,int dno) {
	    	 EntityTransaction t= em.getTransaction();
	    	 try {
	    	 t.begin();
	    	 author d=em.find(author.class, dno);
	    	 p.setAuthor(d);
	    	 em.persist(p);
	    	 t.commit();
	    	 return true;
	    	 }
	    	 catch(Exception e) {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	     }
}