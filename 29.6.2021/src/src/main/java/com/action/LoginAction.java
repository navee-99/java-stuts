package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.forms.LoginForm;

public class LoginAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		//return super.execute(mapping, form, request, response);
		LoginForm loginForm = (LoginForm) form;
		System.out.println(loginForm.toString());
		if(loginForm.getUsername().equals(loginForm.getPassword())){
			return mapping.findForward("success");    
		}
		else{
			return mapping.findForward("failure");    
		}

	}

}
