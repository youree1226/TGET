package com.tget.web.ticket;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tget.service.event.EventService;
import com.tget.service.event.domain.Event;
import com.tget.service.ticket.TicketService;
import com.tget.service.ticket.domain.SellProb;
import com.tget.service.ticket.domain.Ticket;

@Controller
@RequestMapping("/ticket/*")
public class TicketController {
	
	@Qualifier("ticketServiceImpl")
	@Autowired
	private TicketService ticketService;
	@Qualifier("eventServiceImpl")
	@Autowired
	private EventService eventService;
	
	public TicketController() {
		System.out.println(this.getClass());
	}
	
	@RequestMapping(value = "addTicketInfo", method = RequestMethod.GET)	
	public String addTicketInfo( @RequestParam("eventId") String eventId, Model model ) throws Exception{
		
		System.out.println("addTicketInfo : GET // eventId = "+eventId);
		
		Event event = eventService.getEvent(eventId);
		
		model.addAttribute(event);
		
		return "forward:/ticket/addTicketInfo.jsp";
	}
	
	@RequestMapping(value = "addTicketInfo", method = RequestMethod.POST)	
	public String addTicketInfo(@ModelAttribute Ticket ticket, Model model , 
								HttpSession session) throws Exception {
		
		System.out.println("addTicketInfo : POST  ");
		System.out.println(ticket);
				
		session.setAttribute("sellticketInfo", ticket);
		
		SellProb sellProb = ticketService.getTicketPrice(ticket.getEvent().getEventId());
		model.addAttribute(sellProb);
		
		return "forward:/ticket/addTicketPrice.jsp";
	}	
	
	@RequestMapping(value = "addTicketPrice", method = RequestMethod.POST)	
	public String addTicketPrice(@RequestParam("price") int price, Model model , 
								HttpSession session) throws Exception {
		
		System.out.println("addTicketPrice : POST ?price= "+price);
		
		Ticket ticket = (Ticket) session.getAttribute("sellticketInfo");		
		ticket.setPrice(price);
		
		session.setAttribute("sellticketInfo", ticket);
		
		return "forward:/ticket/addTicketImage.jsp";
	}
	
}
