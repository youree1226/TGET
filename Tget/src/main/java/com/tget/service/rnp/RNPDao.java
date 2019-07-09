package com.tget.service.rnp;

import java.util.List;
import java.util.Map;

import com.tget.common.domain.Search;
import com.tget.service.rnp.domain.PointHistory;
import com.tget.service.rnp.domain.Review;



//==> 회원관리에서 CRUD 추상화/캡슐화한 DAO Interface Definition
public interface RNPDao {
	
	public void InsertReview(Review review) throws Exception;

	public Map<String,Object> selectPointHistory(String userId)  throws Exception;
	
	public Map<String,Object> selectReviewList(String buyerId)  throws Exception;
	
	public Map<String,Object> selectSellerEstimationList(String sellerId)  throws Exception;
	
	public Review selectReview(int tranNo)  throws Exception;
	
	public void updateReview(Review review)  throws Exception;
	
	public void insertPointHistory(PointHistory pointHistory)  throws Exception;
	
	

	
}