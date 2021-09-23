package com.thirdware.guptabookstore.pojo;


import java.util.Date;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Table(name = "feedback")
@Data
public class Feedback {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer sno;
@Column(nullable = false,updatable=false)
	private Integer userid;
@Column(nullable = false,updatable=false)
	private Integer bookid;
	private  String rating   ;
	private String command;
	@Basic(optional = false)
	@Column(name = "feedbackdate", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
    private  Date feedbackdate ;
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
	
	
   	@JoinColumn(name="bookid",nullable = false)
    @Transient
   	private Booklist booklist;
   	@ManyToOne(fetch = FetchType.LAZY, optional = true)
   	@JoinColumn(name="userid",nullable = false)
   	@Transient
   	private UserData userdata;

	
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
		StringBuilder titleCase = new StringBuilder(rating.length());
        boolean nextTitleCase = true;

        for (char c : rating.toLowerCase().toCharArray()) {
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
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getCommand() {
		StringBuilder titleCase = new StringBuilder(command.length());
        boolean nextTitleCase = true;

        for (char c : command.toLowerCase().toCharArray()) {
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
