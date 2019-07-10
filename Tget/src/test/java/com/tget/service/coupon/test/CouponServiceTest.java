package com.tget.service.coupon.test;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tget.service.coupon.domain.Coupon;
import com.tget.service.coupon.CouponService;

/*
 *	FileName :  UserServiceTest.java
 * �� JUnit4 (Test Framework) �� Spring Framework ���� Test( Unit Test)
 * �� Spring �� JUnit 4�� ���� ���� Ŭ������ ���� ������ ��� ���� �׽�Ʈ �ڵ带 �ۼ� �� �� �ִ�.
 * �� @RunWith : Meta-data �� ���� wiring(����,DI) �� ��ü ����ü ����
 * �� @ContextConfiguration : Meta-data location ����
 * �� @Test : �׽�Ʈ ���� �ҽ� ����
 */
@RunWith(SpringJUnit4ClassRunner.class)

//==> Meta-Data �� �پ��ϰ� Wiring ����...
//@ContextConfiguration(locations = { "classpath:config/context-*.xml" })
@ContextConfiguration	(locations = {	"classpath:config/context-common.xml",
																	"classpath:config/context-aspect.xml",
																	"classpath:config/context-mybatis.xml",
																	"classpath:config/context-transaction.xml" })
//@ContextConfiguration(locations = { "classpath:config/context-common.xml" })
public class CouponServiceTest {

	//==>@RunWith,@ContextConfiguration �̿� Wiring, Test �� instance DI
	@Autowired
	@Qualifier("couponServiceImpl")
	private CouponService couponService;

	@Test
	public void testAddCoupon() throws Exception {

		Coupon coupon = new Coupon();
		
		coupon.setCouponNo(1);
		coupon.setCouponCode("강조권");
		coupon.setUserId("안녕");
		coupon.setCouponStatement("씀");
		
		couponService.addCoupon(coupon);
		
		coupon = couponService.getCoupon(1);

		//==> console Ȯ��
		//System.out.println(user);
		
		//==> API Ȯ��
		Assert.assertEquals("1", coupon.getCouponNo());
		Assert.assertEquals("강조권", coupon.getCouponCode());
		Assert.assertEquals("안녕", coupon.getUserId());
		Assert.assertEquals("씀", coupon.getCouponStatement());
		Assert.assertEquals("1", coupon.getCouponNo());
	}
	}