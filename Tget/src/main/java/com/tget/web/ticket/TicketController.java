package com.tget.web.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tget.service.ticket.TicketService;
import com.tget.service.ticket.domain.Ticket;

@Controller
@RequestMapping("/ticket/*")
public class TicketController {
	
	@Qualifier("ticketServiceImpl")
	@Autowired
	private TicketService ticketService;
	
	public TicketController() {
		System.out.println(this.getClass());
	}
	
	@RequestMapping(value = "addTicketInfo", method = RequestMethod.GET)	
	public String addTicketInfo() {
		
		return null;
	}
	
	@RequestMapping(value = "addTicketInfo", method = RequestMethod.POST)	
	public String addTicketInfo(@ModelAttribute Ticket ticket) {
		
		return null;
	}	
	
	
}
