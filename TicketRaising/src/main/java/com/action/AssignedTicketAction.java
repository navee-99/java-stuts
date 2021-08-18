package com.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.RaiseTicket;
import com.forms.LoginForm;
import com.repos.PortalDAO;

public class AssignedTicketAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		LoginForm udf=(LoginForm) form;
		List<RaiseTicket> report=PortalDAO.getAssignedList(udf.getUsername());
		System.out.println(report);
		request.getSession().setAttribute("assign",report);
		return mapping.findForward("assigned");
	}
	

}
