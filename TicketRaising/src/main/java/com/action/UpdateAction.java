package com.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.RaiseTicket;
import com.forms.RaiseTicketForm;
import com.repos.PortalDAO;

public class UpdateAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		RaiseTicketForm raise=(RaiseTicketForm)form;
		List<RaiseTicket> tt=PortalDAO.updateStatus(raise.getTicketid());
		request.getSession().setAttribute("status", tt);
		for(RaiseTicket x:tt) {
			x.setStatus(raise.getStatus());
			x.setDescription(raise.getDescription());
			//x.setComands(raise.getComands());
request.getSession().setAttribute("status", tt);
			if(PortalDAO.update(x)) {
				
				return mapping.findForward("success");
			}
		}

		/* return super.execute(mapping, form, request, response); */
		return mapping.findForward("error");
	}


}
