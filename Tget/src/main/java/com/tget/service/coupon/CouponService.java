package com.tget.service.coupon;

import com.tget.service.coupon.domain.Coupon;

public interface CouponService {

	public void addCoupon(Coupon coupon) throws Exception;

	public Coupon getCoupon(int couponNo) throws Exception;
	
	public void updateCoupon(Coupon coupon) throws Exception;
	
	
}
