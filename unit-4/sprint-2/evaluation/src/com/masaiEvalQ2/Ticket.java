package com.masaiEvalQ2;

public class Ticket {
	
	private int ticketid;
	private int price;
	private int availableTickets;
	


	public int getTicketid() {
		return ticketid;
	}

	public void setTicketId(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setAvailableTickets(int availableTickets) {
		if(availableTickets > 0)
			this.availableTickets = availableTickets;
	}
	
	public int getAvailableTickets() {
		return availableTickets;
	}
	
	
	public int calculateTicketCost(int noOfTickets) {
		int currTickets = getAvailableTickets();
		if(currTickets > noOfTickets) {
			setAvailableTickets(currTickets - noOfTickets);
			int totalPrice = noOfTickets * getPrice();
			return totalPrice;
		}
		else {
			return -1;
		}
	}
	
	
}
