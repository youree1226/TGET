package com.tget.service.rnp.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.tget.service.rnp.domain.PointHistory;
import com.tget.service.rnp.domain.Review;
import com.tget.service.event.EventDao;
import com.tget.service.rnp.RNPDao;

@Repository("rNPDaoImpl")
public class RNPDaoImpl implements RNPDao {
	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	///Constructor
	public RNPDaoImpl(){
		System.out.println(this.getClass());
	}

	public void InsertReview(Review review) throws Exception{}

	public Map<String,Object> selectPointHistory()  throws Exception{
		return null;
	}
	
	public Map<String,Object> selectReviewList()  throws Exception{
		return null;
	}
	
	public Map<String,Object> selectSellerEstimationList()  throws Exception{
		return null;
	}
	
	public void updateReview(Review review)  throws Exception{}
	
	public void updatePoint(PointHistory pointHistory)  throws Exception{}
	
	public PointHistory selectPoint()  throws Exception{
		return null;
	}
	
	public Review selectReview()  throws Exception{
		return null;
	}
}