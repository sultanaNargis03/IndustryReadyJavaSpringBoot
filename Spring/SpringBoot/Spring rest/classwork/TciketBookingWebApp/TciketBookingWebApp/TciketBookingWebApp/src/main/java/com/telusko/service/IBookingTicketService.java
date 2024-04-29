package com.telusko.service;

import com.telusko.request.Passenger;
import com.telusko.response.Ticket;

public interface IBookingTicketService 
{
	public Ticket bookTicket(Passenger passenger);
	public Ticket fetchTicketInfo(Integer ticketNumber);

}
