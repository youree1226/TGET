package com.tget.service.community;

import java.util.List;
import java.util.Map;

import com.tget.common.domain.Search;
import com.tget.service.community.domain.Content;
import com.tget.service.community.domain.Reply;
import com.tget.service.community.domain.Report;


public interface CommunityDao {
	
	public void InsertContent(Content content) throws Exception;
	
	public void InsertReport(Report report) throws Exception;
	
	public void updateContent(Content content) throws Exception;
	
	public void deleteContent(int contentNo) throws Exception;
	
    public Content selectContent(int contentNo) throws Exception;

    public List<Content> selectListContent(Search search) throws Exception;
    
    public List<Reply> selectListReply(Search search) throws Exception;

    // 날씨, 길 찾기 어떻게 할까...++++++++++++++++=

    public void updateGoodCount(Map<String,Object> goodCount)throws Exception;
    
    public void updateBadCount(Map<String,Object> badCount)throws Exception;
	// 게시판 Page 처리를 위한 전체Row(totalCount)  return
	public int selectTotalCount(Search search) throws Exception ;
	
	public void updateRefund(Content content) throws Exception;

	public List<Report> selectListReport(Search search) throws Exception;
	
	
}
