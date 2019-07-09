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
		
	}
	
	
	public Event getEvent(int eventId) throws Exception{ 
		return eventDao.selectEvent("바보");
		//return event도메인; Event
	}
	
	
	public  List<Event> getEvent(String eventName) throws Exception{ 
		return eventDao.selectListEvent("바보");
		//return event도메인 리스트;List<Event> 
	}
	
	
	public void updateEventViewCount(int viewCount,String eventId) throws Exception{
		Search search = new Search();
		search.setSearchCondition("0");
		search.setSearchKeyword(String.valueOf(viewCount));
		eventDao.updateEvent(search,eventId);
	}
	
	
	public void updateEventImage(String imageName,String eventId) throws Exception{
		Search search = new Search();
		search.setSearchCondition("1");
		search.setSearchKeyword(imageName);
		eventDao.updateEvent(search,eventId);
	}
	
	
	public Map<String,Object> getEventList() throws Exception{ 
		return null;
	}
	
	
	public List<Event> getInterestedEventList(String userId) throws Exception{
		return null;
	}
	
	
	public void addInterestedEvent(int eventId, String userId) throws Exception{
		
	}
	
	
	public void deleteInterestedEvent(int eventId, String userId) throws Exception{
		
	}
	
	
	public void addYoutubeVideo(String youtubeId, String eventName) throws Exception{ 
		
	}
	
	
	public List<Event> getPopularEventList() throws Exception{ 
		return null;
	}
	
	
	public List<RecommEvent> getRecommendedEventList() throws Exception{ 
		return null;
	}
	
	
	public RecommEvent getRecommendedEvent(int recommEventNo) throws Exception{
		return null;
	}
	
	
	public void addRecommendedEvent(RecommEvent recommEvent) throws Exception{
		
	}
	
	
	public void updateRecommendedEvent(RecommEvent recommEvent) throws Exception{
		
	}
	
	
	public void deleteRecommendedEvent(int recommEventNo) throws Exception{ 
		
	}
	
	
	public List<Category> getCategoryList() throws Exception{ 
		return null;
	}
	
	
	public void addCategoryTwo(Category category) throws Exception{
		
	}
	
	
	public void updateCategoryTwo(Category category) throws Exception{
		
	}
	
	
	public Category selectCategory(int categoryTwoNo) throws Exception{
		return null;
	}
	
	
	public void deleteCategoryTwo(int categoryTwoNo) throws Exception{
		
	}
	
	
}