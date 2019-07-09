package com.tget.service.rnp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tget.service.rnp.domain.PointHistory;
import com.tget.service.rnp.domain.Review;


public interface RNPService {
	
	public void addReview(Review review) throws Exception;
	
	public Map<String,Object> getPointHistory() throws Exception;
	
	public Map<String,Object> getReviewList() throws Exception;
	
	public Map<String,Object> getSellerEstimationList() throws Exception;
	
	public void updateReview(Review review) throws Exception;
	
	public void updatePoint(PointHistory pointHistory) throws Exception;
	
	public void getPoint() throws Exception;
	
	public Review getReview() throws Exception;
	
}