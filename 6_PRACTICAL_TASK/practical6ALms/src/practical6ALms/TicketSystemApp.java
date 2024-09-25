package practical6ALms;

public class TicketSystemApp {
	 public static void main(String[] args) {
	        TicketSystem ticketSystem = new TicketSystem();
	        ticketSystem.addTicket("Issue with login");
	        ticketSystem.addTicket("Payment not processed");
	        ticketSystem.processTicket();
	        ticketSystem.displayTickets();
	    }
}
