package com.action;

import java.util.List;
import com.repos.*;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


import com.entity.Userdata;
import com.forms.LoginForm;

public class UserdataAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		

		LoginForm home= (LoginForm) form;
		//System.out.println(home.toString());
		Userdata users= new Userdata();
	
		System.out.println(users.getPassword()); 
		users.setUsername(home.getUsername());
		users.setPassword(home.getPassword());
		request.getSession().setAttribute("user", home.getUsername());
		//request.getSession().setAttribute("pass", home.getPassword());
		//System.out.println(home.getUsername());
	//users.setPassword(home.getPassword());
		//System.out.println(home.getPassword());
	
		List<Userdata> l=	PortalDAO.getUser(users.getUsername(), users.getPassword());
		List<Userdata> l1=	PortalDAO.getUserpass(users.getUsername(), users.getPassword());
	
		System.out.println(home.toString());
		System.out.println(l.toString());
		System.out.println(users.toString());
		Cookie ck=new Cookie("username",users.getUsername());
		 response.addCookie(ck);
		
			
			if(l.contains("user")) {
				if(l1.contains("user")) {
				
				request.getSession().setAttribute("username", users.getUsername());
				return mapping.findForward("user");
				}else {
					System.out.println("error on if");
					return mapping.findForward("password");
				}
			}else if(l.contains("admin")) {
				if(l1.contains("admin")) {
					
					request.getSession().setAttribute("username", users.getUsername());
					return mapping.findForward("admin");
				}else {
					System.out.println("error on if");
					return mapping.findForward("password");
					
				}
				
			}else {
				System.out.println("error on if");
				return mapping.findForward("username");
			}
		
		
	}
}
