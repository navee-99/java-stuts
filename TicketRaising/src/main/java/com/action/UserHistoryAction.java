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
import com.forms.RaiseTicketForm;
import com.repos.PortalDAO;

public class UserHistoryAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		LoginForm r=(LoginForm)form;
		List<RaiseTicket>  history=PortalDAO.getHistory(r.getUsername());
		request.getSession().setAttribute("history", history);
		return mapping.findForward("success");
	}


}
