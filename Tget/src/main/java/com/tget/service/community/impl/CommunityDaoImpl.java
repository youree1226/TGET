package com.tget.service.community.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.tget.common.domain.Search;
import com.tget.service.community.CommunityDao;
import com.tget.service.community.domain.Content;
import com.tget.service.community.domain.Reply;
import com.tget.service.community.domain.Report;

@Repository("communityDaoImpl")
public class CommunityDaoImpl implements CommunityDao{

	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public CommunityDaoImpl(){
		System.out.println(this.getClass());
	}

	@Override
	public void InsertContent(Content content) throws Exception {
		sqlSession.insert("CommunityMapper.insertContent", content);
	}
	
	@Override
	public void InsertReport(Report report) throws Exception{
		sqlSession.insert("CommunityMapper.insertReport", report);
	}
	
	@Override
	public void InsertReply(Reply reply) throws Exception{
		sqlSession.insert("CommunityMapper.insertReply", reply);
	}
	
	@Override
	public Content selectContent(int contentNo) throws Exception {
		return sqlSession.selectOne("CommunityMapper.selectContent", contentNo);
	}
	
	@Override
	public void updateContent(Content content) throws Exception {
		sqlSession.update("CommunityMapper.updateContent", content);
	}
	
	@Override
	public void deleteContent(int contentNo) throws Exception{
		sqlSession.delete("CommunityMapper.deleteContent", contentNo);
	}
	
	@Override
	public void deleteReply(int replyNo) throws Exception{
		sqlSession.delete("CommunityMapper.deleteReply", replyNo);
	}

	@Override
	public List<Content> selectListContent(Search search) throws Exception {
		return sqlSession.selectList("CommunityMapper.selectListContent", search);
	}
	
	@Override
	public void updateReply(Reply reply) throws Exception {
		sqlSession.update("CommunityMapper.updateReply", reply);
	}
	
	@Override
	public void updateGoodCount(Map<String, Object> goodCount) throws Exception {
		sqlSession.update("CommunityMapper.updateGoodCount", goodCount);		
	}
	
	@Override
	public void updateBadCount(Map<String, Object> BadCount) throws Exception {
		sqlSession.update("CommunityMapper.updateBadCount", BadCount);		
	}
	
	@Override
	public int selectTotalCount(Search search) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("ProductMapper.selectTotalCount", search);
	}
	
	@Override
	public void updateRefund(Content content) throws Exception {
		sqlSession.update("CommunityMapper.updateRefund", content);
	}

	@Override
	public List<Report> selectListReport(Search search) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("CommunityMapper.selectListReport", search);
	}
	
	@Override
	public List<Reply> selectListReply(Search search) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("CommunityMapper.selectListReply", search);
	}
}
