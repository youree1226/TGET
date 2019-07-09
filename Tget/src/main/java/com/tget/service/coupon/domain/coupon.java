package com.tget.service.coupon.domain;

public class coupon {

	private int couponNo;
	private String couponCode;
	private String userId;
	private String couponUseDate;
	private String couponRegDate;
	private String couponStatement;
	
	public coupon() {
		// TODO Auto-generated constructor stub
	}

	public int getCouponNo() {
		return couponNo;
	}

	public void setCouponNo(int couponNo) {
		this.couponNo = couponNo;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCouponUseDate() {
		return couponUseDate;
	}

	public void setCouponUseDate(String couponUseDate) {
		this.couponUseDate = couponUseDate;
	}

	public String getCouponRegDate() {
		return couponRegDate;
	}

	public void setCouponRegDate(String couponRegDate) {
		this.couponRegDate = couponRegDate;
	}

	public String getCouponStatement() {
		return couponStatement;
	}

	public void setCouponStatement(String couponStatement) {
		this.couponStatement = couponStatement;
	}

	@Override
	public String toString() {
		return "coupon [couponNo=" + couponNo + ", couponCode=" + couponCode + ", userId=" + userId + ", couponUseDate="
				+ couponUseDate + ", couponRegDate=" + couponRegDate + ", couponStatement=" + couponStatement + "]";
	}
	

	
}
