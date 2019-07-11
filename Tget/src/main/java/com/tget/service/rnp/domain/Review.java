package com.tget.service.rnp.domain;


import java.sql.Date;

import com.tget.service.event.domain.Category;

public class Review {

	///F
	private int tranNo;
	private int score;
	private String reviewBody;
	private Date regDate;
	private String buyerId;
	private String sellerId;
	
	///C
	public Review() {
	}

	public int getTranNo() {
		return tranNo;
	}

	public void setTranNo(int tranNo) {
		this.tranNo = tranNo;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getReviewBody() {
		return reviewBody;
	}

	public void setReviewBody(String reviewBody) {
		this.reviewBody = reviewBody;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String toString() {
		return "[Review] tranNo : "+tranNo+", "+"score : "+score+", " + 
				"reviewBody : "+reviewBody+", " +"regDate : "+regDate+", " + 
				"buyerId : "+buyerId+", " + "sellerId : "+sellerId;
	}
}
