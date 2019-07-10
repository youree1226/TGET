package com.tget.service.event.impl;

import java.util.HashMap;
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
import com.tget.service.user.domain.User;
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
		sqlSession.insert("EventMapper.insertEvent", event);
	}
	
	
	public Event selectEvent(String eventId) throws Exception{
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("eventId", eventId);
		map.put("searchKeyword", "eventId");
		return sqlSession.selectOne("EventMapper.selectEvent", map);
	}
	
	
	public List<Event> selectListEvent(String eventName) throws Exception{
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("eventName", eventName);
		map.put("searchKeyword", "eventName");
		//return sqlSession.selectList("EventMapper.selectListEvent", map);
		return sqlSession.selectList("EventMapper.selectEvent", map);
	}
	
	
	public void updateEvent(Search search,String eventId) throws Exception{ 
		//searchCondition는 0이면 viewCount, 1이면 imageName;
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("search", search);
		map.put("eventId", eventId);
		sqlSession.update("EventMapper.updateEvent", search);
	}
	
	
	public List<Event> selectListInterestedEvent(String userId) throws Exception{
		return sqlSession.selectList("EventMapper.selectListInterestedEvent", userId);
	}
	
	
	public void InsertInterestedEvent(String eventId, String userId) throws Exception{
		Event event = new Event();
		event.setUserId(userId);
		event.setEventId(eventId);
		sqlSession.insert("EventMapper.InsertEvent", event);
	}
	
	
	public void deleteInterestedEvent(String eventId, String userId) throws Exception{
		Event event = new Event();
		event.setUserId(userId);
		event.setEventId(eventId);
		sqlSession.delete("EventMapper.deleteInterestedEvent", event);
	}
	
	
	public void InsertYoutubeVideo(String youtubeId, String eventName) throws Exception{ 
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("youtubeId",youtubeId);
		map.put("eventName", eventName);
		sqlSession.insert("EventMapper.InsertYoutubeVideo", map);
	}
	
	
	public void deleteYoutubeVideo(int youtubeNo) throws Exception{
		sqlSession.delete("EventMapper.deleteYoutubeVideo",youtubeNo);
	}
	
	
	public List<String> selectListYoutubeId(String eventName) throws Exception{
		return sqlSession.selectList("EventMapper.selectListYoutubeId",eventName);
	}
	
	
	public List<Event> selectListPopularEvent() throws Exception{ 
		return sqlSession.selectList("EventMapper.selectListPopularEvent");
	}
	
	
	public List<RecommEvent> selectListRecommendedEvent() throws Exception{ 
		//Map<String,Object> map = new HashMap<String,Object>();
		return sqlSession.selectList("EventMapper.selectRecommendedEvent");
	}
	
	
	public RecommEvent selectRecommendedEvent(int recommEventNo) throws Exception{
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("recommEventNo",recommEventNo);
		return sqlSession.selectOne("EventMapper.selectRecommendedEvent", map);
	}
	
	
	public void InsertRecommendedEvent(RecommEvent recommEvent) throws Exception{ 
		sqlSession.insert("EventMapper.InsertRecommendedEvent", recommEvent);
	}
	
	
	public void updateRecommendedEvent(RecommEvent recommEvent) throws Exception{
		sqlSession.update("EventMapper.updateRecommendedEvent", recommEvent);
	}
	
	
	public void deleteRecommendedEvent(int recommEventNo) throws Exception{ 
		sqlSession.delete("EventMapper.deleteRecommendedEvent",recommEventNo);
	}
	
	
	public void InsertCategoryTwo(Category category) throws Exception{ 
		sqlSession.insert("EventMapper.InsertCategoryTwo",category);
	}
	
	
	public void updateCategoryTwo(Category category) throws Exception{ 
		sqlSession.update("EventMapper.updateCategoryTwo",category);
	}
	
	
	public List<Category> selectListCategory() throws Exception{
		return sqlSession.selectList("EventMapper.selectCategory");
	}
	
	
	public Category selectCategory(int categoryTwoNo) throws Exception{
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("categoryTwoNo",categoryTwoNo);
		return sqlSession.selectOne("EventMapper.selectCategory", map);
	}
	
	
	public void deleteCategoryTwo(int categoryTwoNo) throws Exception{
		sqlSession.delete("EventMapper.deleteCategoryTwo",categoryTwoNo);
	}
	
	
	public List<User> selectInterestedByUser(Search search) throws Exception{
		//searchCondition = 0이면  InterestedCategory, searchCondition = 1이면 InterestedEvent
		return sqlSession.selectList("EventMapper.selectInterestedByUser",search);
	}
	
	
	public Map<String,Object> getEventList(Search search) throws Exception{
		//rest api
		return null;
	}
	
	
	public Map<String,Object> getYoutubeList(Search search) throws Exception{
		//rest api
		return null;
	}
	
	
}