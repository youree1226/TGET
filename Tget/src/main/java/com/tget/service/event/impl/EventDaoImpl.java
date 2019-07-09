package com.tget.service.event.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.tget.common.domain.Search;
import com.tget.service.event.domain.Category;
import com.tget.service.event.domain.Event;
import com.tget.service.event.domain.RecommEvent;
import com.tget.service.event.EventDao;

@Repository("eventDaoImpl")
public class EventDaoImpl implements EventDao {
	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	///Constructor
	public EventDaoImpl(){
		System.out.println(this.getClass());
	}


	///M
	public void InsertEvent(Event event) throws Exception{
		sqlSession.insert("EventMapper.InsertEvent", event);
	}
	
	
	public Event selectEvent(String eventId) throws Exception{ 
		return sqlSession.selectOne("EventMapper.selectEvent", eventId);
	}
	
	
	public List<Event> selectListEvent(String eventName) throws Exception{
		return sqlSession.selectList("EventMapper.selectListEvent", eventName);
	}
	
	
	public void updateEvent(Search search) throws Exception{ 
		//searchCondition는 0이면 viewCount, 1이면 imageName;
		//sqlSession.update("EventMapper.updateEvent", user);
	}
	
	
	public List<Event> selectListInterestedEvent() throws Exception{
		return null;
	}
	
	
	public void InsertInterestedEvent(int eventId, String userId) throws Exception{
		
	}
	
	
	public void deleteInterestedEvent(int eventId, String userId) throws Exception{
		
	}
	
	
	public void InsertYoutubeVideo(String youtubeId, String eventName) throws Exception{ 
		
	}
	
	
	public List<Event> selectListPopularEvent() throws Exception{ 
		return null;
	}
	
	
	public List<RecommEvent> selectListRecommendedEvent() throws Exception{ 
		return null;
	}
	
	
	public RecommEvent selectRecommendedEvent(int recommEventNo) throws Exception{
		return null;
	}
	
	
	public void InsertRecommendedEvent(RecommEvent recommEvent) throws Exception{ 
		
	}
	
	
	public void updateRecommendedEvent(RecommEvent recommEvent) throws Exception{
		
	}
	
	
	public void deleteRecommendedEvent(int recommEventNo) throws Exception{ 
		
	}
	
	
	public List<Category> selectListCategory() throws Exception{
		return null;
	}
	
	
	public void InsertCategoryTwo(Category category) throws Exception{ 
		
	}
	
	
	public void updateCategoryTwo(Category category) throws Exception{ 
		
	}
	
	
	public Category selectCategory(int categoryTwoNo) throws Exception{
		return null;
	}
	
	
	public void deleteCategoryTwo(int categoryTwoNo) throws Exception{
		
	}
	
	
	public Map<String,Object> getEventList() throws Exception{
		return null;
	}
	
	
	public Map<String,Object> getYoutubeList() throws Exception{
		return null;
	}
	
	
}