package com.tget.service.rnp.domain;

import java.sql.Date;

public class PointHistory {

	///F
	private String userId;
	private int pointUpdateCode;
	private Date regDate;
	private int tranNo;
	private int totalPoint;
	private int updatePoint;
	
	///C
	public PointHistory() {
	}

	///M
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getPointUpdateCode() {
		return pointUpdateCode;
	}

	public void setPointUpdateCode(int pointUpdateCode) {
		this.pointUpdateCode = pointUpdateCode;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getTranNo() {
		return tranNo;
	}

	public void setTranNo(int tranNo) {
		this.tranNo = tranNo;
	}

	public int getTotalPoint() {
		return totalPoint;
	}

	public void setTotalPoint(int totalPoint) {
		this.totalPoint = totalPoint;
	}

	public int getUpdatePoint() {
		return updatePoint;
	}

	public void setUpdatePoint(int updatePoint) {
		this.updatePoint = updatePoint;
	}
	
	public String toString() {
		return "[PointHistory] userId : "+userId+", "+"pointUpdateCode : "+pointUpdateCode+", " + 
				"tranNo : "+tranNo+", " +"regDate : "+regDate+", " + 
				"totalPoint : "+totalPoint+", " + "updatePoint : "+updatePoint;
	}

}
