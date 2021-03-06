package com.repos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.entity.RaiseTicket;
import com.entity.Userdata;
import com.entity.Userprofile;

public class PortalDAO {
	private static EntityManager em=JPARepository.getEntityManager();
	public static List<Userdata> getUser(String username, String password){
		Query q= em.createQuery("SELECT p.usertype FROM Userdata p WHERE p.username = '" +username+"'");
System.out.println(username);
/* + "' and p.password= '"+password */
	List<Userdata> list= q.getResultList();
	return list;
	}
	public static List<Userdata> getUserpass(String username, String password){
		Query q= em.createQuery("SELECT p.usertype FROM Userdata p WHERE p.password = '" +password+"'");
System.out.println(password);
/* + "' and p.password= '"+password */
	List<Userdata> list= q.getResultList();
	return list;
	}
	public static List<Userdata> getDetails(){
		Query q=em.createQuery("select p from Userdata p");
		List<Userdata> l=q.getResultList();
		return l;
	}
	public static List<Userprofile> getProfile(String username ){
		Query q=em.createQuery("SELECT p FROM Userprofile p WHERE p.username='"+username+"'");
		List<Userprofile> profile=q.getResultList();
		return profile;
	}
	public static List<RaiseTicket> getTicket(String username ){
		Query q=em.createQuery("SELECT p FROM RaiseTicket p WHERE p.byuser='"+username+"'");
		List<RaiseTicket> ticket=q.getResultList();
		return ticket;
	}
	public static List<RaiseTicket> getHistory(String username){
		Query q=em.createQuery("SELECT p FROM RaiseTicket p WHERE p.status='closed' and p.byuser='"+username+"'");
		List<RaiseTicket> history=q.getResultList();
		return history;
		
	}
	public static List<RaiseTicket> getAdminHistory(String username){
		Query q=em.createQuery("SELECT p FROM RaiseTicket p WHERE p.status='closed' and  p.toadmin='"+username+"'");
		List<RaiseTicket> history=q.getResultList();
		return history;
		
	}
	public static List<RaiseTicket> getOpenList(String username)
	{
		Query s=em.createQuery("select p from RaiseTicket p where p.status='open' and  p.byuser ='"+username+"'");
		List<RaiseTicket> adminList=s.getResultList();
		return adminList;
		
	}
	public static List<Userdata> getAdminList()
	{
		Query q=em.createQuery("select p from Userdata p where p.usertype='admin'");
		List<Userdata> adminList=q.getResultList();
		return adminList;
		
	}
	public static List<RaiseTicket> updateStatus(Integer id){
		Query s=em.createQuery("select p from RaiseTicket p where  p.ticketid ='"+id+"'");
		List<RaiseTicket> status=s.getResultList();
		return status;
	}
	public static List<RaiseTicket> getAssignedList(String username)
	{
		Query s=em.createQuery("select p from RaiseTicket p where p.status='open' and  p.toadmin ='"+username+"'");
		List<RaiseTicket> assignList=s.getResultList();
		return assignList;
		
	}
	public static List<RaiseTicket> getValues() {
	 	  Query q =em.createQuery("Select p from RaiseTicket p" );//JPAQL
			  List<RaiseTicket> l=q.getResultList();
			  
			  return l;
	   }
	
	public static boolean addPerson(Userdata um) {

		EntityTransaction t= em.getTransaction();

		try {
			t.begin();
			em.persist(um);			
			t.commit();
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	public static boolean addTicket(RaiseTicket te) 
	{
	  	 EntityTransaction t= em.getTransaction();
	  	 try {
	  	 t.begin();
	  	 em.persist(te);
	  	 t.commit();
	  	 return true;
	  	 }
	  	 catch(Exception e) {
	  		 return false;
	  	 }
	   }
	public static boolean addStatus(RaiseTicket um) {

		EntityTransaction t= em.getTransaction();

		try {
			t.begin();
			em.persist(um);			
			t.commit();
			return true;
			}
		catch(Exception e) {
			return false;
		}
	}
	 public static boolean update(RaiseTicket p) {
	   	 EntityTransaction t= em.getTransaction();
	   	 try {
	   	 t.begin();
	   	 em.merge(p);
	   	 t.commit();
	   	 }
	   	 catch(Exception e) {
	   		 throw e;
	   	 }
		return true;
	    }
	
}
