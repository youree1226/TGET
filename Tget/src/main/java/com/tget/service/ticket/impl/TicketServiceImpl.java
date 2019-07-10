package com.tget.service.ticket.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tget.common.domain.Search;
import com.tget.service.ticket.TicketDao;
import com.tget.service.ticket.TicketService;
import com.tget.service.ticket.domain.SellProb;
import com.tget.service.ticket.domain.Ticket;

@Service("ticketServiceImpl")
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	@Qualifier("ticketDaoImpl")
	private TicketDao ticketDao;
	
	public void setTicketDao(TicketDao ticketDao) {
		this.ticketDao = ticketDao;
	}
	
	public TicketServiceImpl() {
		System.out.println(this.getClass());
	}
	
	@Override
	public void addTicket(Ticket ticket) throws Exception {
		// TODO Auto-generated method stub
		ticketDao.insertTicket(ticket);
	}

	@Override
	public void updateTicketCode(Ticket ticket) throws Exception {
		// TODO Auto-generated method stub
		ticketDao.updateTicketCode(ticket);
	}

	@Override
	public void updateTicketAmount(Ticket ticket) throws Exception {
		// TODO Auto-generated method stub
		ticketDao.updateTicketAmount(ticket);
	}

	@Override
	public Ticket getTicket(int ticketNo) throws Exception {
		// TODO Auto-generated method stub
		return ticketDao.selectTicket(ticketNo);
	}

	@Override
	public Map<String, Object> getTicketList(Search search) throws Exception {
		// TODO Auto-generated method stub
		List<Ticket> list = ticketDao.selectListTicket(search);
		SellProb sellprob = null;
		
		return null;
	}

	@Override
	public SellProb getTicketSellProb(String eventId, int price) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
