package com.tget.service.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tget.service.event.domain.Category;
import com.tget.service.event.domain.Event;
import com.tget.service.event.domain.RecommEvent;


public interface EventService {
	
	public void addEvent(Event event) throws Exception;
	public Event getEvent(int eventId) throws Exception;//return event도메인; 
	public  List<Event> getEvent(String eventName) throws Exception;//return event도메인 리스트; 
	public void updateEventViewCount(int viewCount,String eventId) throws Exception;
	public void updateEventImage(String imageName,String eventId) throws Exception;
	public Map<String,Object> getEventList() throws Exception;
	public List<Event> getInterestedEventList(String userId) throws Exception;
	public void addInterestedEvent(int eventId, String userId) throws Exception;
	public void deleteInterestedEvent(int eventId, String userId) throws Exception;
	public void addYoutubeVideo(String youtubeId, String eventName) throws Exception;
	public List<Event> getPopularEventList() throws Exception;
	public List<RecommEvent> getRecommendedEventList() throws Exception;
	public RecommEvent getRecommendedEvent(int recommEventNo) throws Exception;
	public void addRecommendedEvent(RecommEvent recommEvent) throws Exception;
	public void updateRecommendedEvent(RecommEvent recommEvent) throws Exception;
	public void deleteRecommendedEvent(int recommEventNo) throws Exception;
	public List<Category> getCategoryList() throws Exception;
	public void addCategoryTwo(Category category) throws Exception;
	public void updateCategoryTwo(Category category) throws Exception;
	public Category selectCategory(int categoryTwoNo) throws Exception;
	public void deleteCategoryTwo(int categoryTwoNo) throws Exception;

}