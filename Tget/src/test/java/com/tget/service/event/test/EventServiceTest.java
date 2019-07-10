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
 * �� JUnit4 (Test Framework) �� Spring Framework ���� Test( Unit Test)
 * �� Spring �� JUnit 4�� ���� ���� Ŭ������ ���� ������ ��� ���� �׽�Ʈ �ڵ带 �ۼ� �� �� �ִ�.
 * �� @RunWith : Meta-data �� ���� wiring(����,DI) �� ��ü ����ü ����
 * �� @ContextConfiguration : Meta-data location ����
 * �� @Test : �׽�Ʈ ���� �ҽ� ����
 */
@RunWith(SpringJUnit4ClassRunner.class)

//==> Meta-Data �� �پ��ϰ� Wiring ����...
//@ContextConfiguration(locations = { "classpath:config/context-*.xml" })
@ContextConfiguration	(locations = {	"classpath:config/context-common.xml",
																	"classpath:config/context-aspect.xml",
																	"classpath:config/context-mybatis.xml",
																	"classpath:config/context-transaction.xml" })
//@ContextConfiguration(locations = { "classpath:config/context-common.xml" })
public class EventServiceTest {

	//==>@RunWith,@ContextConfiguration �̿� Wiring, Test �� instance DI
	@Autowired
	@Qualifier("eventServiceImpl")
	private EventService eventService;

	
	@Test
	public void addEvent() throws Exception {
		
		
		Event event = new Event();
		event.setEventId("testEventId");
		event.setCategoryTwoNo(10000);
		event.setEventDate(new Date(2012, 4, 8));
		event.setEventLocation("����");
		event.setEventName("EXO");
		event.setEventTime(1248);
		//event.setViewCount(viewCount);

		eventService.addEvent(event);
		//==> API Ȯ��
		event = eventService.getEvent(event.getEventId());
		System.out.println(event);
		
		Assert.assertEquals("testEventId", event.getEventId());
		Assert.assertNotNull(eventService.getEvent("event02"));
	}
	
	//@Test
		public void getEvent() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API Ȯ��
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void getEventByName() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API Ȯ��
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void updateEventViewCount() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API Ȯ��
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void updateEventImage() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API Ȯ��
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void getInterestedEventList() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API Ȯ��
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void addInterestedEvent() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API Ȯ��
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void deleteInterestedEvent() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API Ȯ��
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void addYoutubeVideo() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API Ȯ��
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void getPopularEventList() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API Ȯ��
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void getRecommendedEventList() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API Ȯ��
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void getRecommendedEvent() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API Ȯ��
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void addRecommendedEvent() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API Ȯ��
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		
		//@Test
		public void updateRecommendedEvent() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API Ȯ��
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void deleteRecommendedEvent() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API Ȯ��
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void getCategoryList() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API Ȯ��
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void addCategoryTwo() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API Ȯ��
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void updateCategoryTwo() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API Ȯ��
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void getCategory() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API Ȯ��
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void deleteCategoryTwo() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API Ȯ��
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void getEventList() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API Ȯ��
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
		
		//@Test
		public void getYoutubeList() throws Exception {
			
			Event event = new Event();
//				event.setEventId("testEventId");

			event = eventService.getEvent("testEventId");

			//System.out.println(event);
			
			//==> API Ȯ��
			Assert.assertEquals("testEventId", event.getEventId());


			Assert.assertNotNull(eventService.getEvent("event02"));
		}
	
		
}