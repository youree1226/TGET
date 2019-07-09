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
		rNPDao.InsertReview(review);
	}
	
	public Map<String,Object> getPointHistory() throws Exception{
		return rNPDao.selectPointHistory();
	}
	
	public Map<String,Object> getReviewList() throws Exception{
		return rNPDao.selectReviewList();
	}
	
	public Map<String,Object> getSellerEstimationList() throws Exception{
		return rNPDao.selectSellerEstimationList();
	}
	
	public void updateReview(Review review) throws Exception{
		rNPDao.updateReview(review);
	}
	
	public void updatePoint(PointHistory pointHistory) throws Exception{
		rNPDao.updatePoint(pointHistory);
	}
	
	public void getPoint() throws Exception{
		rNPDao.selectPoint();
	}
	
	public Review getReview() throws Exception{
		return rNPDao.selectReview();
	}
	
}