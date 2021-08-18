package com.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.Userdata;
import com.entity.Userprofile;
import com.forms.LoginForm;
import com.repos.PortalDAO;

public class ProfileAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		LoginForm lf=(LoginForm) form;
		System.out.println(lf.toString());
		Userprofile p=new Userprofile();
		List<Userprofile> l=PortalDAO.getProfile(lf.getUsername());
	    request.getSession().setAttribute("profile", l);
	    return mapping.findForward("success");
	
		
	}
	

}
