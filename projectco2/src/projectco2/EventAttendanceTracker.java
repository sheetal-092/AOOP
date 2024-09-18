package projectco2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EventAttendanceTracker {
	private Map<String, Set<String>> eventAttendance;

    public EventAttendanceTracker() {
        eventAttendance = new HashMap<>();
    }

    
    public void addAttendee(String eventName, String attendeeName) {
        eventAttendance.putIfAbsent(eventName, new HashSet<>());
        Set<String> attendees = eventAttendance.get(eventName);
        attendees.add(attendeeName);
        System.out.println(attendeeName + " has been added to the event: " + eventName);
    }

  
    public void displayAttendees(String eventName) {
        Set<String> attendees = eventAttendance.get(eventName);
        if (attendees == null || attendees.isEmpty()) {
            System.out.println("No attendees for the event: " + eventName);
        } else {
            System.out.println("Attendees for event " + eventName + ":");
            for (String attendee : attendees) {
                System.out.println("- " + attendee);
            }
        }
    }

   
    public void displayAllEvents() {
        if (eventAttendance.isEmpty()) {
            System.out.println("No events to display.");
        } else {
            for (String eventName : eventAttendance.keySet()) {
                displayAttendees(eventName);
            }
        }
    }

    public static void main(String[] args) {
        EventAttendanceTracker tracker = new EventAttendanceTracker();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Attendee");
            System.out.println("2. Display Attendees of an Event");
            System.out.println("3. Display All Events and Attendees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.next();

            switch (choice) {
                case "1":
                    System.out.print("Enter event name: ");
                    String eventName = scanner.next();
                    System.out.print("Enter attendee name: ");
                    String attendeeName = scanner.next();
                    tracker.addAttendee(eventName, attendeeName);
                    break;

                case "2":
                    System.out.print("Enter event name: ");
                    String eventToDisplay = scanner.next();
                    tracker.displayAttendees(eventToDisplay);
                    break;

                case "3":
                    tracker.displayAllEvents();
                    break;

                case "4":
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }

        } while (!choice.equals("4"));

        scanner.close();
    }
}
