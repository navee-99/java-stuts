package com.action;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


import com.entity.author;
import com.form.BookForm;
import com.repos.JPARepository;
import com.repos.LaibrariesDAO;



public class AuthorAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		List<author> list=LaibrariesDAO.getAuthor();
		BookForm book= (BookForm) form;
        for(author x:list)
        	JPARepository.getEntityManager().refresh(x);
	    book.setAuthorid(list);

	    request.setAttribute("authors", LaibrariesDAO.getAuthor());
		return mapping.findForward("success");
	}

}