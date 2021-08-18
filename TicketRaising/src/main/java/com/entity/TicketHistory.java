package com.entity;

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
@Table(name="tikethistory")
public class TicketHistory extends ActionForm {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "sno", updatable = false, nullable = false)

	
	private Integer sno;
	@Column
	private Integer tiketid;
	@Column
	private String message;
	@Column
	private String timrstamp;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "tiketid")
	  private  RaiseTicket RaiseTicket;

	
	public RaiseTicket getRaiseTicket() {
		return RaiseTicket;
	}
	public void setRaiseTicket(RaiseTicket raiseTicket) {
		RaiseTicket = raiseTicket;
	}
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public Integer getTiketid() {
		return tiketid;
	}
	public void setTiketid(Integer tiketid) {
		this.tiketid = tiketid;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTimrstamp() {
		return timrstamp;
	}
	public void setTimrstamp(String timrstamp) {
		this.timrstamp = timrstamp;
	}
	@Override
	public String toString() {
		return "TiketHistory [sno=" + sno + ", tiketid=" + tiketid + ", message=" + message + ", timrstamp=" + timrstamp
				+ "]";
	}
	public TicketHistory(Integer sno, Integer tiketid, String message, String timrstamp) {
		super();
		this.sno = sno;
		this.tiketid = tiketid;
		this.message = message;
		this.timrstamp = timrstamp;
	}
	public TicketHistory() {}
	
	

	
}
