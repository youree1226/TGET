package com.tget.web.event;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.tget.common.domain.Search;
import com.tget.service.event.EventService;
import com.tget.service.event.domain.Category;
import com.tget.service.event.domain.Event;
import com.tget.service.event.domain.RecommEvent;
import com.tget.service.event.domain.StubhubEvent;
import com.tget.service.event.domain.YoutubeVideoList;
import com.tget.service.ticket.TicketService;
import com.tget.service.ticket.domain.SellProb;
import com.tget.service.ticket.domain.Ticket;


//==> 회원관리 Controller
@Controller
@RequestMapping("/event/*")
public class EventController {
	
	///Field
	@Autowired
	@Qualifier("eventServiceImpl")
	private EventService eventService;
	
	@Autowired
	@Qualifier("ticketServiceImpl")
	private TicketService ticketService;
	
	
	@Value("#{apiKeyProperties['youtubeKey']}")
	String youtubeKey;
	
	@Value("#{apiKeyProperties['stubhubKey']}")
	String stubhubKey;
	
	
	///Constructor
	public EventController(){
		System.out.println(this.getClass());
	}
	

	///Method
	@RequestMapping(value="getEventList")
	public String getEventList(@ModelAttribute("search") Search search, @RequestParam String requestPageToken,Model model) throws Exception {
		System.out.println("===============getEventList===============");
		System.out.println(search);
		
		Map<String,Object> map = eventService.getEventList(search, requestPageToken, stubhubKey);
		//(List<StubhubEvent>)map.get("eventList")
		//int totalResults = (Integer)map.get("totalResults");
		//model.addAttribute("totalResults",totalResults);
		//model.addAttribute("eventList",(List<StubhubEvent>)map.get("eventList"));
		model.addAllAttributes(map);
		
		return "forward:/event/listEvent.jsp";
		
	}
	
	@RequestMapping(value="getEvent")
	public String getEvent(@RequestParam String eventName, Model model) throws Exception {
		System.out.println("===============getEvent===============");
		
		Search search = new Search();
		search.setSearchCondition("0");
		
		List<Event> eventListByName = eventService.getEventByName(eventName);
		System.out.println(eventListByName);
		
		for (Event event : eventListByName) {
			search.setSearchKeyword(event.getEventId());
			int ticketLowestPrice = ((SellProb)ticketService.getTicketList(search).get("sellProb")).getLowPrice();
			event.setTicketLowestPrice(ticketLowestPrice);
			event.setTotalTicketCount(((SellProb)ticketService.getTicketList(search).get("sellProb")).getTotalCount());
		}
		System.out.println(eventListByName);
		
		model.addAttribute("eventListByName", eventListByName);
		
		return "forward:/event/getEvent.jsp";
	}
	
	@RequestMapping(value="getEventTicketList")
	public String getEventTicketList(@RequestParam String eventId, HttpServletRequest request, Model model) throws Exception {
		System.out.println("===============getEventTicketList===============");
		
		Search search = new Search();
		search.setSearchCondition("0");
		search.setSearchKeyword(eventId);
		
		Map<String, Object> map = ticketService.getTicketList(search);
		//eventId에 따른 티켓 리스트
		
		List<Ticket> ticketList = (List<Ticket>)map.get("list");
		SellProb sellProb = (SellProb)map.get("sellProb");
		
		Event event = eventService.getEvent(eventId);
		
		model.addAttribute("event", event);
		model.addAttribute("ticketList", ticketList);
		model.addAttribute("lowPrice", sellProb.getLowPrice());
		model.addAttribute("totalTicketCount",sellProb.getTotalCount());
		
		return "forward:/event/listEventTicket.jsp";		
	}
	
	@RequestMapping(value="getInterestedEventList")
	public String getInterestedEventList(@RequestParam String userId, Model model) throws Exception {
		System.out.println("===============getInterestedEventList===============");
		
		List<Event> list = eventService.getInterestedEventList(userId);
		model.addAttribute("interestedEventList", list);
		
		return "forward:/event/listInterestedEvent.jsp";
		
	}
	
	@RequestMapping(value="getEventManage")
	public String getEventManage(Model model) throws Exception {
		System.out.println("===============getEventManage===============");
		
		List<RecommEvent> recommEventlist = eventService.getRecommendedEventList();
		List<Category> categorylist = eventService.getCategoryList();
		
		model.addAttribute("recommEventlist", recommEventlist);
		model.addAttribute("categorylist", categorylist);
		
		return "forward:/event/getEventManage.jsp";
		
	}
	
	@RequestMapping(value="getYoutubePlayer")
	public String getYoutubePlayer(@RequestParam String youtubeId,Model model) throws Exception {
		System.out.println("===============getYoutubePlayer===============");
		//youtube를 search하고 그 결과를 보여주는 화면에서, 특정 동영상 재생을 할 수 있는 화면으로 넘어갈 때
		//팝업창 화면 자체를 페이지 이동시키는 것이므로 이 Method는 RestController로 가지 않을 것...(?)
		model.addAttribute("youtubeId", youtubeId);
		
		return "forward:/event/getYoutubePlayer.jsp";
	}
	
	
	
}