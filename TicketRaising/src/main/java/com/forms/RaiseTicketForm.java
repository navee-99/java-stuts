package com.forms;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.entity.Userdata;



public class RaiseTicketForm extends ActionForm
{
	private int ticketid;
	private String subject;
	private String description;
	private String byuser;
	private String toadmin;
	private String status;
	private java.sql.Date dateraised;
	private String comands;
	
	public RaiseTicketForm(int ticketid, String subject, String description, String byuser, String toadmin,
			String status, Date dateraised, String comands) {
		super();
		this.ticketid = ticketid;
		this.subject = subject;
		this.description = description;
		this.byuser = byuser;
		this.toadmin = toadmin;
		this.status = status;
		this.dateraised = dateraised;
		this.comands = comands;
	}
	public String getComands() {
		return comands;
	}
	public void setComands(String comands) {
		this.comands = comands;
	}
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
	    ActionErrors errors = new ActionErrors();
	    if (subject == null || subject.length() < 10) {
	        errors.add("subject", new ActionMessage("error.subject.required"));
	    }
	    if (description == null || description.length() < 10) {
	        errors.add("description", new ActionMessage("error.description.required"));
	    }
	    return errors;
	}
	public RaiseTicketForm() {}
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public String getSubject() {
		StringBuilder titleCase = new StringBuilder(subject.length());
        boolean nextTitleCase = true;

        for (char c : subject.toLowerCase().toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }
            titleCase.append(c);
        }

       return titleCase.toString();
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getByuser() {
		return byuser;
	}
	public void setByuser(String byuser) {
		this.byuser = byuser;
	}
	public String getToadmin() {
		return toadmin;
	}
	public void setToadmin(String toadmin) {
		this.toadmin = toadmin;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public java.sql.Date getDateraised() {
		return dateraised;
	}
	public void setDateraised(java.sql.Date dateraised) {
		this.dateraised = dateraised;
	}
	@Override
	public String toString() {
		return "RaiseTicketForm [ticketid=" + ticketid + ", subject=" + subject + ", description=" + description
				+ ", byuser=" + byuser + ", toadmin=" + toadmin + ", status=" + status + ", dateraised=" + dateraised
				+ ", comands=" + comands + "]";
	}
	

	
	

}
