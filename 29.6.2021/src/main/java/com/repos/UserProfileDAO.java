package com.repos;

import java.util.Iterator;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;


import com.entity.Userprofile;

public class UserProfileDAO {
	private static EntityManager em=JPARepository.getEntityManager();
	public static List<Userprofile> getDetails(){
		Query q=em.createQuery("select p from Userprofile p");
		List<Userprofile> l=q.getResultList();
		return l;
	}

	public static boolean addUser(Userprofile up) {

		EntityTransaction t= em.getTransaction();

		try {
			t.begin();
			em.persist(up);
			t.commit();
			return true;
			}
		catch(Exception e) {
			return false;
		}
	}

}
