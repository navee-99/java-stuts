package com.action;


/*import java.sql.Date;*/
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.RaiseTicket;
import com.entity.Userdata;
import com.forms.LoginForm;
import com.forms.RaiseTicketForm;

import com.repos.PortalDAO;

public class TicketAction extends Action
{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub	
		//Enumeration<String> keys=request.getSession().getAttributeNames();
		/*
		 * while (keys.hasMoreElements()){ String key = (String)keys.nextElement();
		 * System. out.println(key + ": " +request.getSession().getValue(key) + "<br>");
		 * }
		 */
		RaiseTicketForm tf=(RaiseTicketForm) form;
		System.out.println(tf.toString());
		RaiseTicket te=new RaiseTicket();
		te.setSubject(tf.getSubject());
		te.setDescription(tf.getDescription());
		te.setStatus("open");
		//if(request.getSession().isNew()) {}
		//if(request.getAttribute("user") != null) {
			//System.out.println("not null");
		//}
		//LoginForm log= (LoginForm)form;
		/*
		 * Enumeration<String> keys=request.getSession().getAttributeNames(); while
		 * (keys.hasMoreElements()){ String key = (String)keys.nextElement(); System.
		 * out.println(key + ": " +request.getSession().getValue(key) + "<br>"); }
		 */
		//request.getSession().setAttribute("user", log.getUsername());
		LoginForm tf1= (LoginForm) request.getSession().getValue("LoginForm");

		//System.out.println("In TicketAction,"+request.getSession().getAttribute("user"));
		te.setByuser(tf1.getUsername());	
		LocalDate localDate = LocalDate.now();

		//Get LocalDate from SQL date
		java.sql.Date sqlDate = java.sql.Date.valueOf( localDate );
		te.setDateraised(sqlDate);
		List<Userdata> list=PortalDAO.getAdminList();
		System.out.println(list);
		Random random=new Random();
		int r=random.nextInt(list.size());
		System.out.println(r);
		System.out.println(list.get(r).getUsername());
		//te.setToadminname(list.get(r).getUsertype());
		te.setToadmin(list.get(r).getUsername());
		System.out.println(te.toString());


		System.out.println(te);

		if(PortalDAO.addTicket(te))
		{
			System.out.println(te);

			return mapping.findForward("Tickets");
		}
		return mapping.findForward("error");
	}
}
