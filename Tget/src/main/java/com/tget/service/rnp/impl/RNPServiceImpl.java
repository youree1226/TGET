package com.tget.service.rnp.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tget.service.rnp.domain.PointHistory;
import com.tget.service.rnp.domain.Review;
import com.tget.service.event.EventService;
import com.tget.service.rnp.RNPDao;
import com.tget.service.rnp.RNPService;


@Service("rNPServiceImpl")
public class RNPServiceImpl implements RNPService{
	///F
	@Autowired
	@Qualifier("rNPDaoImpl")
	private RNPDao rNPDao;

	///M
	public void addReview(Review review) throws Exception{
		rNPDao.updateReview(review);
	}
	
	public List<PointHistory> getPointHistory(String userId) throws Exception{
		//rNPDao.selectPointHistory(userId);
		return null;
	}
	
	public List<Review> getReviewList(String buyerId) throws Exception{
		//rNPDao.selectReviewList(buyerId);
		return null;
	}
	
	public List<Review> getSellerEstimationList(String sellerId) throws Exception{
		//rNPDao.selectSellerEstimationList(sellerId);
		return null;
	}
	
	public void updateReview(Review review) throws Exception{
		rNPDao.updateReview(review);
	}
	
	public void addPoint(PointHistory pointHistory) throws Exception{
		rNPDao.insertPointHistory(pointHistory);
	}
	
	public Review getReview(int tranNo) throws Exception{
		return rNPDao.selectReview(tranNo);
	}
	
}