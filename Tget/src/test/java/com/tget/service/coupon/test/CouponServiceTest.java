package com.tget.service.coupon.test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tget.service.coupon.domain.Coupon;
import com.tget.service.user.domain.User;
import com.tget.service.coupon.CouponService;

/*
 *	FileName :  UserServiceTest.java
 * 占쏙옙 JUnit4 (Test Framework) 占쏙옙 Spring Framework 占쏙옙占쏙옙 Test( Unit Test)
 * 占쏙옙 Spring 占쏙옙 JUnit 4占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙 클占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占� 占쏙옙占쏙옙 占쌓쏙옙트 占쌘드를 占쌜쇽옙 占쏙옙 占쏙옙 占쌍댐옙.
 * 占쏙옙 @RunWith : Meta-data 占쏙옙 占쏙옙占쏙옙 wiring(占쏙옙占쏙옙,DI) 占쏙옙 占쏙옙체 占쏙옙占쏙옙체 占쏙옙占쏙옙
 * 占쏙옙 @ContextConfiguration : Meta-data location 占쏙옙占쏙옙
 * 占쏙옙 @Test : 占쌓쏙옙트 占쏙옙占쏙옙 占쌀쏙옙 占쏙옙占쏙옙
 */
@RunWith(SpringJUnit4ClassRunner.class)

//==> Meta-Data 占쏙옙 占쌕억옙占싹곤옙 Wiring 占쏙옙占쏙옙...
//@ContextConfiguration(locations = { "classpath:config/context-*.xml" })
@ContextConfiguration	(locations = {	"classpath:config/context-common.xml",
																	"classpath:config/context-aspect.xml",
																	"classpath:config/context-mybatis.xml",
																	"classpath:config/context-transaction.xml" })
//@ContextConfiguration(locations = { "classpath:config/context-common.xml" })
public class CouponServiceTest {

	//==>@RunWith,@ContextConfiguration 占싱울옙 Wiring, Test 占쏙옙 instance DI
	@Autowired
	@Qualifier("couponServiceImpl")
	private CouponService couponService;

	/*@Test
	public void testAddCoupon() throws Exception {

		Coupon coupon = new Coupon();
		
		
		coupon.setCouponCode("1");
		coupon.setUserId("testUserId");
		coupon.setCouponStatement("1");
		
		couponService.addCoupon(coupon);
		
		coupon = couponService.getCoupon(1);

		//==> console 확占쏙옙
		//System.out.println(user);
		
		//==> API 확占쏙옙
		
		Assert.assertEquals("1", coupon.getCouponCode());
		Assert.assertEquals("testUserId", coupon.getUserId());
		Assert.assertEquals("1", coupon.getCouponStatement());
	}*/
	
	//@Test
	public void testGetCoupon() throws Exception {
		
Coupon coupon = new Coupon();

		coupon.setCouponCode("1");
		coupon.setUserId("testUserId");
		coupon.setCouponStatement("1");
		
		couponService.addCoupon(coupon);
	
		coupon = couponService.getCoupon(10008);

		//==> console 확占쏙옙
		//System.out.println(user);
		
		//==> API 확占쏙옙
		Assert.assertEquals("1", coupon.getCouponCode());
		Assert.assertEquals("testUserId", coupon.getUserId());
		Assert.assertEquals("1", coupon.getCouponStatement());
	}
	@Test
	 public void testUpdateCoupon() throws Exception{
		 
		Coupon coupon = couponService.getCoupon(10001);
		Assert.assertNotNull(coupon);
		
		Assert.assertEquals(10001,coupon.getCouponNo());
		Assert.assertEquals("1", coupon.getCouponCode());
		Assert.assertEquals("testUserId", coupon.getUserId());
		Assert.assertEquals("1", coupon.getCouponStatement());

		
		
		coupon.setCouponCode("9");
		coupon.setUserId("testUserId2");
		coupon.setCouponStatement("9");
		
		couponService.updateCoupon(coupon);
		
		coupon = couponService.getCoupon(10001);
		Assert.assertNotNull(coupon);
		
		System.out.println(coupon);
			
		Assert.assertEquals("9", coupon.getCouponCode());
		Assert.assertEquals("testUserId2", coupon.getUserId());
		Assert.assertEquals("9", coupon.getCouponStatement());
	
	 }
	 
	
	
	}