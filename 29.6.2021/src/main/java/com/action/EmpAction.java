package com.action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.Emp;
import com.form.EmpForm;
import com.repos.OrganizationDAO;

public class EmpAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		EmpForm emp=(EmpForm)form;
		System.out.println(emp);
		Emp e=new Emp();
		e.setEmpno(emp.getEmpno());
		e.setCity(emp.getCity());
		e.setName(emp.getName());


		if(OrganizationDAO.addEmp(e,emp.getDeptno())) {
			e.setEmpno(0);
			e.setName(null);
			e.setCity(null);
			return mapping.findForward("success");
		}
			return  mapping.findForward("error");
		}
	}


