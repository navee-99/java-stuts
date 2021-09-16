package com.thirdware.guptabookstore.pojo;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "feedback")
@Data
public class Feedback {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer sno;
@Column(insertable=false,updatable=false)
	private Integer userid;
@Column(insertable=false,updatable=false)
	private Integer bookid;
	private  String rating   ;
	private String command;
	
    private  Date feedbackdate ;
    @ManyToOne(cascade=CascadeType.ALL)
	
	
   	@JoinColumn(name="bookid",nullable = false)
   	private Booklist booklist;
   	@ManyToOne(cascade=CascadeType.ALL)
   	@JoinColumn(name="userid",nullable = false)
   	private Registerform registerform;

	
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public Date getFeedbackdate() {
		return feedbackdate;
	}
	public void setFeedbackdate(Date feedbackdate) {
		this.feedbackdate = feedbackdate;
	}

}
