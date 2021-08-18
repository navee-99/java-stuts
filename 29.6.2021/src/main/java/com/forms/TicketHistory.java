package com.forms;

import org.apache.struts.action.ActionForm;

public class TicketHistory  extends ActionForm{

	private Integer sno;
	private Integer tiketid;
	private String message;
	private String timrstamp;
	@Override
	public String toString() {
		return "TiketHistory [sno=" + sno + ", tiketid=" + tiketid + ", message=" + message + ", timrstamp=" + timrstamp
				+ "]";
	}
	public TicketHistory() {}
	public TicketHistory(Integer sno, Integer tiketid, String message, String timrstamp) {
		super();
		this.sno = sno;
		this.tiketid = tiketid;
		this.message = message;
		this.timrstamp = timrstamp;
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
	
}
