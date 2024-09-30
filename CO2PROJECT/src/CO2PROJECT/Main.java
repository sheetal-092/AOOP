package CO2PROJECT;

public class Main {
	public static void main(String[] args) {
  
        EventAttendanceTracker tracker = new EventAttendanceTracker();

        
        tracker.addAttendee("Tech Conference", "Alice");
        tracker.addAttendee("Tech Conference", "Bob");
        tracker.addAttendee("Music Fest", "Charlie");
        tracker.addAttendee("Music Fest", "Alice");
        tracker.addAttendee("Art Exhibition", "Dave");

       
        tracker.printAttendees("Tech Conference");
        tracker.printAttendees("Music Fest");
        tracker.printAttendees("Art Exhibition");

  
        tracker.removeAttendee("Music Fest", "Alice");

       
        if (tracker.isAttending("Tech Conference", "Alice")) {
            System.out.println("Alice is attending the Tech Conference.");
        } else {
            System.out.println("Alice is not attending the Tech Conference.");
        }

       
        tracker.printAllEvents();
    }
}
