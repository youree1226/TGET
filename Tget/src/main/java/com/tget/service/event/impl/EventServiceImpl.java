package com.tget.service.event.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tget.common.domain.Search;
import com.tget.service.event.domain.Category;
import com.tget.service.event.domain.Event;
import com.tget.service.event.domain.RecommEvent;
import com.tget.service.event.EventDao;
import com.tget.service.event.EventService;


@Service("eventServiceImpl")
public class EventServiceImpl implements EventService{
	///F
	@Autowired
	@Qualifier("eventDaoImpl")
	private EventDao eventDao;
	

	public void addEvent(Event event) throws Exception{
		eventDao.InsertEvent(event);
	}
	
	
	public Event getEvent(String eventId) throws Exception{ 
		return eventDao.selectEvent(eventId);
		//return event도메인; Event
	}
	
	
	public  List<Event> getEventByName(String eventName) throws Exception{ 
		return eventDao.selectListEvent(eventName);
		//return event도메인 리스트;List<Event> 
	}
	
	
	public void updateEventViewCount(int viewCount,String eventName) throws Exception{
		Search search = new Search();
		search.setSearchCondition("0");
		search.setSearchKeyword(String.valueOf(viewCount));
		eventDao.updateEvent(search,eventName);
	}
	
	
	public void updateEventImage(String imageName,String eventName) throws Exception{
		Search search = new Search();
		search.setSearchCondition("1");
		search.setSearchKeyword(imageName);
		eventDao.updateEvent(search,eventName);
	}
	
	
	public List<Event> getInterestedEventList(String userId) throws Exception{
		return eventDao.selectListInterestedEvent(userId);
	}
	
	
	public void addInterestedEvent(String eventId, String userId) throws Exception{
		eventDao.InsertInterestedEvent(eventId,userId);
	}
	
	
	public void deleteInterestedEvent(String eventId, String userId) throws Exception{
		eventDao.deleteInterestedEvent(eventId,userId);
	}
	
	
	public void addYoutubeVideo(String youtubeId, String eventName) throws Exception{ 
		eventDao.InsertYoutubeVideo(youtubeId, eventName);
	}
	
	
	public List<Event> getPopularEventList() throws Exception{ 
		return eventDao.selectListPopularEvent();
	}
	
	
	public List<RecommEvent> getRecommendedEventList() throws Exception{ 
		return eventDao.selectListRecommendedEvent();
	}
	
	
	public RecommEvent getRecommendedEvent(int recommEventNo) throws Exception{
		return eventDao.selectRecommendedEvent(recommEventNo);
	}
	
	
	public void addRecommendedEvent(RecommEvent recommEvent) throws Exception{
		eventDao.InsertRecommendedEvent(recommEvent);
	}
	
	
	public void updateRecommendedEvent(RecommEvent recommEvent) throws Exception{
		eventDao.updateRecommendedEvent(recommEvent);
	}
	
	
	public void deleteRecommendedEvent(int recommEventNo) throws Exception{ 
		eventDao.deleteRecommendedEvent(recommEventNo);
	}
	
	
	public List<Category> getCategoryList() throws Exception{ 
		return eventDao.selectListCategory();
	}
	
	
	public void addCategoryTwo(Category category) throws Exception{
		eventDao.InsertCategoryTwo(category);
	}
	
	
	public void updateCategoryTwo(Category category) throws Exception{
		eventDao.updateCategoryTwo(category);
	}
	
	
	public Category getCategory(int categoryTwoNo) throws Exception{
		return eventDao.selectCategory(categoryTwoNo);
	}
	
	
	public void deleteCategoryTwo(int categoryTwoNo) throws Exception{
		eventDao.deleteCategoryTwo(categoryTwoNo);
	}
	
	
	public Map<String,Object> getEventList(Search search) throws Exception{ 
		return eventDao.getEventList(search);
	}
	
	
	public Map<String,Object> getYoutubeList(Search search) throws Exception{
		return eventDao.getYoutubeList(search);
	}
	
	
}