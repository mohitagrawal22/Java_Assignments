package com.masaiDay5Q2;
	
	import java.util.Scanner;


	public class TicketMain {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Ticket tckt = new Ticket();
			
			System.out.println("Enter no of bookings:");
			int noOfBookings = sc.nextInt();
			
			System.out.println("Enter the available tickets:");
			int totalAvailableTickets = sc.nextInt();
			
			tckt.setAvailableTickets(totalAvailableTickets);
			
			while(noOfBookings > 0) {
				
				System.out.println("Enter ticketid:");
				int ticketId = sc.nextInt();
				tckt.setTicketId(ticketId);
				
				System.out.println("Enter the price:");
				int ticketPrice = sc.nextInt();
				tckt.setPrice(ticketPrice);
				
				System.out.println("Enter the no of Tickets:");
				int noOfTickets = sc.nextInt();
				
				System.out.println("Available Tickets: " + tckt.getAvailableTickets());
				
				int totalAmount = tckt.calculateTicketCost(noOfTickets);
				
				System.out.println("Total Amount: " + totalAmount);
				System.out.println("Available ticket after booking: " + tckt.getAvailableTickets());
				
				System.out.println();
				
				noOfBookings--;
			}
			
			sc.close();
		}
	}
	