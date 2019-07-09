package com.tget.service.rnp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tget.service.rnp.domain.PointHistory;
import com.tget.service.rnp.domain.Review;


public interface RNPService {
	
	public void addReview(Review review) throws Exception;
	
	public Map<String,Object> getPointHistory(String userId) throws Exception;
	
	public Map<String,Object> getReviewList(String buyerId) throws Exception;
	
	public Map<String,Object> getSellerEstimationList(String sellerId) throws Exception;
	
	public void updateReview(Review review) throws Exception;
	
	public void addPoint(PointHistory pointHistory) throws Exception;
	
	public Review getReview(int tranNo) throws Exception;
	
}