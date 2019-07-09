package com.tget.service.rnp.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.tget.service.rnp.domain.PointHistory;
import com.tget.service.rnp.domain.Review;
import com.tget.common.domain.Search;
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

//	public void InsertReview(Review review) throws Exception{
//		sqlSession.insert("RNPMapper.InsertReview",review);
//	}
	//애초에 transaction 테이블 안의 리뷰 관련 칼럼에 값을 넣는 거라서 insert문을 쓸 수 없다. 무조건 update 쿼리날려야함

	public Map<String,Object> selectPointHistory(String userId)  throws Exception{
		sqlSession.selectList("RNPMapper.selectPointHistory",userId);
		return null;
	}
	
	public Map<String,Object> selectReviewList(String buyerId)  throws Exception{
		//searchCondition==0 buyerId 로 검색
		Search search = new Search();
		search.setSearchCondition("0");
		search.setSearchKeyword(buyerId);
		sqlSession.selectList("RNPMapper.selectReviewList",search);
		return null;
	}
	
	public Map<String,Object> selectSellerEstimationList(String sellerId)  throws Exception{
		//searchCondition==1  sellerId 로 검색
		Search search = new Search();
		search.setSearchCondition("1");
		search.setSearchKeyword(sellerId);
		sqlSession.selectList("RNPMapper.selectReviewList",search);
		return null;
	}
	
	public Review selectReview(int tranNo)  throws Exception{
		return sqlSession.selectOne("RNPMapper.selectReview",tranNo);
	}
	
	public void updateReview(Review review)  throws Exception{
		sqlSession.update("RNPMapper.updateReview",review);
	}
	
	public void insertPointHistory(PointHistory pointHistory)  throws Exception{
		sqlSession.insert("RNPMapper.insertPointHistory", pointHistory);
	}

	
	
}