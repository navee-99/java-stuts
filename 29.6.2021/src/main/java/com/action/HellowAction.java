package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.form.FirstForm;

public class HellowAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		FirstForm firstform=(FirstForm) form;
		request.setAttribute("oldvalue", firstform.getMessage());
		firstform.setMessage("this is changed");
		request.setAttribute("first", " india indian");
		
		return mapping.findForward("success" );
	}
	

}
