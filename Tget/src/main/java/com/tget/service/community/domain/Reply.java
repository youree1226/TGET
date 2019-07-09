package com.tget.service.community.domain;

import java.sql.Date;

public class Reply {
	
	private int replyNo;
	private String userId;
	private String userNickName;
	private int contentNo;
	private String replyBody;
	private Date regDate;
	
	public int getReplyNo() {
		return replyNo;
	}
	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserNickName() {
		return userNickName;
	}
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	public int getContentNo() {
		return contentNo;
	}
	public void setContentNo(int contentNo) {
		this.contentNo = contentNo;
	}
	public String getReplyBody() {
		return replyBody;
	}
	public void setReplyBody(String replyBody) {
		this.replyBody = replyBody;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "Reply [replyNo=" + replyNo + ", userId=" + userId + ", userNickName=" + userNickName + ", contentNo="
				+ contentNo + ", replyBody=" + replyBody + ", regDate=" + regDate + "]";
	}
	
	
}
