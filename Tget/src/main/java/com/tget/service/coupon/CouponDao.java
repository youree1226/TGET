package com.tget.service.coupon;

import com.tget.service.coupon.domain.Coupon;

public interface CouponDao {

	public void insertCoupon(Coupon coupon) throws Exception;

	public Coupon selectCoupon(int couponNo) throws Exception;
	
	public void updateCoupon(Coupon coupon) throws Exception;
	
}