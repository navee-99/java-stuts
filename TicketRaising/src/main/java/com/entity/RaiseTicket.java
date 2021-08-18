package com.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.struts.action.ActionForm;

@Entity
@Table(name="tickets")
public class RaiseTicket extends ActionForm
{
	
	

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "ticketid", updatable = false, nullable = false)

	private int ticketid;
	@Column
	private String subject;
	@Column
	private String description;
	@Column
	private String byuser;	
	@Column
	private String toadmin;
	@Column
	private String status;
	@Column
	private java.sql.Date dateraised;
	
	public RaiseTicket() {}

	public RaiseTicket(int ticketid, String subject, String description, String byuser, String toadmin, String status,
			Date dateraised) {
		super();
		this.ticketid = ticketid;
		this.subject = subject;
		this.description = description;
		this.byuser = byuser;
		this.toadmin = toadmin;
		this.status = status;
		this.dateraised = dateraised;
	}

	@Override
	public String toString() {
		return "RaiseTicket [ticketid=" + ticketid + ", subject=" + subject + ", description=" + description
				+ ", byuser=" + byuser + ", toadmin=" + toadmin + ", status=" + status + ", dateraised=" + dateraised
				+ "]";
	}

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public String getSubject() {
		return subject;
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


	


}
