package com.tget.service.event;

import java.util.List;
import java.util.Map;

import com.tget.service.event.domain.Category;
import com.tget.service.event.domain.Event;
import com.tget.service.event.domain.RecommEvent;
import com.tget.service.user.domain.User;
import com.tget.common.domain.Search;



//==> 회원관리에서 CRUD 추상화/캡슐화한 DAO Interface Definition
public interface EventDao {

	public void InsertEvent(Event event) throws Exception;
	public Event selectEvent(String eventId) throws Exception;
	public List<Event> selectListEvent(String eventName) throws Exception;
	public void updateEvent(Search search,String eventId) throws Exception;
	public List<Event> selectListInterestedEvent(String userId) throws Exception;
	public void InsertInterestedEvent(String eventId, String userId) throws Exception;
	public void deleteInterestedEvent(String eventId, String userId) throws Exception;
	public void InsertYoutubeVideo(String youtubeId, String eventName) throws Exception;
	public void deleteYoutubeVideo(int youtubeNo) throws Exception;
	public List<String> selectListYoutubeId(String eventName) throws Exception;
	public List<Event> selectListPopularEvent() throws Exception;
	public List<RecommEvent> selectListRecommendedEvent() throws Exception;
	public RecommEvent selectRecommendedEvent(int recommEventNo) throws Exception;
	public void InsertRecommendedEvent(RecommEvent recommEvent) throws Exception;
	public void updateRecommendedEvent(RecommEvent recommEvent) throws Exception;
	public void deleteRecommendedEvent(int recommEventNo) throws Exception;
	public List<Category> selectListCategory() throws Exception;
	public void InsertCategoryTwo(Category category) throws Exception;
	public void updateCategoryTwo(Category category) throws Exception;
	public Category selectCategory(int categoryTwoNo) throws Exception;
	public void deleteCategoryTwo(int categoryTwoNo) throws Exception;
	public List<User> selectInterestedByUser(Search search) throws Exception;
	public Map<String,Object> getEventList() throws Exception;
	public Map<String,Object> getYoutubeList() throws Exception;
	
	
}