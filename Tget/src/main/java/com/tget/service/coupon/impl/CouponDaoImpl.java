package com.tget.service.coupon.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.tget.service.coupon.CouponDao;
import com.tget.service.coupon.domain.Coupon;

@Repository("couponDaoImpl")
public class CouponDaoImpl implements CouponDao{
	
	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	///Constructor
		public CouponDaoImpl() {
			System.out.println(this.getClass());
		}
	
	@Override
	public void insertCoupon(Coupon coupon) throws Exception {
		sqlSession.insert("CouponMapper.insertCoupon", coupon);
		
	}
	@Override
	public Coupon selectCoupon(int couponNo) throws Exception {
		return sqlSession.selectOne("CouponMapper.selectCoupon", couponNo);
	}
	@Override
	public void updateCoupon(Coupon coupon) throws Exception {
		sqlSession.update("CouponMapper.updateCoupon", coupon);
		
	}
	


}