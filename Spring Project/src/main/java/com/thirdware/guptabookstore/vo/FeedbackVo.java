package com.thirdware.guptabookstore.vo;

import java.sql.Date;

public class FeedbackVo {
	private Integer userid;
	private Integer bookid;
	private  String rating;
	private String command;
	 private  Date feedbackdate ;
	 public FeedbackVo() {
		 
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
	public FeedbackVo(Integer userid, Integer bookid, String rating, String command, Date feedbackdate) {
		super();
		this.userid = userid;
		this.bookid = bookid;
		this.rating = rating;
		this.command = command;
		this.feedbackdate = feedbackdate;
	}
	public void setFeedbackdate(Date feedbackdate) {
		this.feedbackdate = feedbackdate;
	}
	@Override
	public String toString() {
		return "FeedbackVo [userid=" + userid + ", bookid=" + bookid + ", rating=" + rating + ", command=" + command
				+ ", feedbackdate=" + feedbackdate + "]";
	}
}
