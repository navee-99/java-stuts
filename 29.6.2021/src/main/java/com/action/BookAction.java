package com.action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.Book;

import com.form.BookForm;

import com.repos.LaibrariesDAO;


public class BookAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		BookForm book=(BookForm)form;
		System.out.println(book);
		Book e=new Book();
		e.setBookid(book.getBookid());
		e.setName(book.getName());
		e.setPages(book.getPages());
		e.setPrice(book.getPrice());


		if(LaibrariesDAO.addBook(e,book.getBookno())) {
			e.setBookid(0);
			e.setName(null);
			e.setPages(0);
			e.setPrice(0);
			return mapping.findForward("success");
		}
			return  mapping.findForward("error");
		}
}