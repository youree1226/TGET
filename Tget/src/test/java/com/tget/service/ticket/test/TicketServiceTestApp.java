package com.tget.service.ticket.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tget.common.domain.Search;
import com.tget.service.event.domain.Event;
import com.tget.service.ticket.TicketService;
import com.tget.service.ticket.domain.Ticket;
import com.tget.service.user.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration	(locations = {	"classpath:config/context-common.xml",
																	"classpath:config/context-aspect.xml",
																	"classpath:config/context-mybatis.xml",
																	"classpath:config/context-transaction.xml" })
public class TicketServiceTestApp {
	
	@Autowired
	@Qualifier("ticketServiceImpl")
	private TicketService ticketService;
	
	//@Test	
	public void addTransaction() throws Exception {
		
		Ticket ticket = new Ticket();
		Event event = new Event();
		User user = new User();
		
		event.setEventId("testId");
		user.setUserId("admin");
		
		ticket.setEvent(event);
		ticket.setSeller(user);
		
		ticket.setAmount(10);
		ticket.setPrice(400000);
		ticket.setType("0");
		ticket.setSeat("e열34");
		ticket.setOptions("애정행각금지");
		ticket.setTicketImage("ddd.jpg");
		
		ticketService.addTicket(ticket);
		
	}
	
	@Test
	public void updateTicketCode() throws Exception {
		
		Ticket ticket = new Ticket();
		ticket.setTicketNo(10002);
		ticket.setCode("1");
		
		ticketService.updateTicketCode(ticket);
	}
	
	//@Test
	public void selectListTicket() throws Exception {
		
		ticketService.getTicketList(new Search());
		
	}
}
