package practical6ALms;

import java.util.LinkedList;
import java.util.Queue;

public class TicketSystem {
	 private Queue<String> tickets;

	    public TicketSystem() {
	        tickets = new LinkedList<>();
	    }

	    public void addTicket(String ticket) {
	        tickets.add(ticket);
	    }

	    public void processTicket() {
	        if (!tickets.isEmpty()) {
	            tickets.poll();
	        }
	    }

	    public void displayTickets() {
	        int index = 1;
	        for (String ticket : tickets) {
	            System.out.println(index++ + ". " + ticket);
	        }
	    }
}
