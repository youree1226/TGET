package com.tget.service.community;

import java.util.Map;

import com.tget.common.domain.Search;
import com.tget.service.community.domain.Content;
import com.tget.service.community.domain.Report;

public interface CommunityService {
	
	
		public void addContent(Content content) throws Exception;

		public void addReport(Report report) throws Exception;
		
		public Content getContent(int contentNo) throws Exception;

		public Map<String,Object> getContentList(Search search) throws Exception;
		
		public Map<String,Object> getReplyList(Search search) throws Exception;

		public Map<String,Object> getReportList(Search search) throws Exception; //getTotalCount, getReportList 
		
		public void updateContent(Content content) throws Exception;
		
		public void updateGoodCount(Map<String,Object> goodCount)throws Exception;
		
		public void updateBadCount(Map<String,Object> badCount)throws Exception;
		
		public void updateRefund(Content content) throws Exception;
		
		//날씨 어떻게 할지....
}