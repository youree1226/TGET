package com.tget.service.event.test;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tget.service.event.EventService;
import com.tget.service.event.domain.Event;



/*
 *	FileName :  EventServiceTest.java
 * ㅇ JUnit4 (Test Framework) 과 Spring Framework 통합 Test( Unit Test)
 * ㅇ Spring 은 JUnit 4를 위한 지원 클래스를 통해 스프링 기반 통합 테스트 코드를 작성 할 수 있다.
 * ㅇ @RunWith : Meta-data 를 통한 wiring(생성,DI) 할 객체 구현체 지정
 * ㅇ @ContextConfiguration : Meta-data location 지정
 * ㅇ @Test : 테스트 실행 소스 지정
 */
@RunWith(SpringJUnit4ClassRunner.class)

//==> Meta-Data 를 다양하게 Wiring 하자...
//@ContextConfiguration(locations = { "classpath:config/context-*.xml" })
@ContextConfiguration	(locations = {	"classpath:config/context-common.xml",
																	"classpath:config/context-aspect.xml",
																	"classpath:config/context-mybatis.xml",
																	"classpath:config/context-transaction.xml" })
//@ContextConfiguration(locations = { "classpath:config/context-common.xml" })
public class EventServiceTest {

	//==>@RunWith,@ContextConfiguration 이용 Wiring, Test 할 instance DI
	@Autowired
	@Qualifier("eventServiceImpl")
	private EventService eventService;

	
	@Test
	public void addEvent() throws Exception {
		
		
		Event event = new Event();
		event.setEventId("testEventId");
		event.setCategoryTwoNo(10000);
		event.setEventDate(new Date(2012, 4, 8));
		event.setEventLocation("서울");
		event.setEventName("EXO");
		event.setEventTime(1248);
		//event.setViewCount(viewCount);
		
		Event event2 = new Event();
		event2.setEventId("testEventId2");
		event2.setCategoryTwoNo(10000);
		event2.setEventDate(new Date(2012, 4, 8));
		event2.setEventLocation("서울");
		event2.setEventName("EXO");
		event2.setEventTime(1248);

		eventService.addEvent(event);
		//==> API 확인
		
	}
	
		//@Test
		public void getEvent() throws Exception {
			
			Event event = eventService.getEvent("testEventId");
			System.out.println(event);
			Assert.assertNotNull(eventService.getEvent("testEventId"));
			Assert.assertEquals("testEventId", event.getEventId());			
		}
		
		//@Test
		public void getEventByName() throws Exception {
			
			List<Event> eventList = eventService.getEventByName("EXO Seoul");

			System.out.println(eventList);
			
		}
		
		//@Test
		public void updateEventViewCount() throws Exception {
			
			List<Event> eventList = eventService.getEventByName("EXO");
			System.out.println("eventList : "+eventList);
			int view = 0;
			for (Event event : eventList) {
				view = event.getViewCount();
				System.out.println(view);
			}
			eventService.updateEventViewCount(view+1, "testEventId");

			//System.out.println(event);			
			eventList = eventService.getEventByName("EXO");
			System.out.println("eventList : "+eventList);
		}
		
		//@Test
		public void updateEventImage() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API 확인
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void getInterestedEventList() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API 확인
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void addInterestedEvent() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API 확인
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void deleteInterestedEvent() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API 확인
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void addYoutubeVideo() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API 확인
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void getPopularEventList() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API 확인
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void getRecommendedEventList() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API 확인
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void getRecommendedEvent() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API 확인
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void addRecommendedEvent() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API 확인
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		
		//@Test
		public void updateRecommendedEvent() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API 확인
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void deleteRecommendedEvent() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API 확인
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void getCategoryList() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API 확인
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void addCategoryTwo() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API 확인
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void updateCategoryTwo() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API 확인
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void getCategory() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API 확인
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void deleteCategoryTwo() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API 확인
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void getEventList() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API 확인
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void getYoutubeList() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API 확인
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
	
		
}