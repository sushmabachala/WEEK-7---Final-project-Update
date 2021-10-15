package com.info.client;

import com.info.bookingService.Booking;
import com.info.bookingService.TicketFactory;

public class BookTicket {
	
	
	public static void main(String[] args) {
		 
		//Factory Pattern to create objects to book and cancel tickets 
		TicketFactory factory = new TicketFactory();
		
		Booking passenger =  factory.getInstance("");
		passenger.registerUser();
		passenger.bookTicket();
		passenger.cancelTicket();
		
		//Iterator Pattern to show the available 
		
		
		//Observer pattern to show the notification after booking the ticket 
		
		
		
		
	}

}
