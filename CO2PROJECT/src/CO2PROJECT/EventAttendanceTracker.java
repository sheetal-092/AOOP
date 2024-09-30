package CO2PROJECT;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EventAttendanceTracker {

    private Map<String, Set<String>> eventAttendees;

    public EventAttendanceTracker() {
    
        eventAttendees = new HashMap<>();
    }

    
    public void addAttendee(String event, String attendee) {
       
        eventAttendees.putIfAbsent(event, new HashSet<>());
       
        eventAttendees.get(event).add(attendee);
        System.out.println(attendee + " has been added to the event: " + event);
    }

   
    public void removeAttendee(String event, String attendee) {
        
        if (eventAttendees.containsKey(event)) {
            Set<String> attendees = eventAttendees.get(event);
            if (attendees.remove(attendee)) {
                System.out.println(attendee + " has been removed from the event: " + event);
            } else {
                System.out.println(attendee + " was not found in the event: " + event);
            }
        } else {
            System.out.println("Event not found: " + event);
        }
    }

    
    public void printAttendees(String event) {
        if (eventAttendees.containsKey(event)) {
            Set<String> attendees = eventAttendees.get(event);
            if (!attendees.isEmpty()) {
                System.out.println("Attendees for event " + event + ": " + attendees);
            } else {
                System.out.println("No attendees registered for event: " + event);
            }
        } else {
            System.out.println("Event not found: " + event);
        }
    }

   
    public boolean isAttending(String event, String attendee) {
        return eventAttendees.containsKey(event) && eventAttendees.get(event).contains(attendee);
    }

   
    public void printAllEvents() {
        if (eventAttendees.isEmpty()) {
            System.out.println("No events have been added yet.");
        } else {
            System.out.println("All Events and Attendees:");
            for (Map.Entry<String, Set<String>> entry : eventAttendees.entrySet()) {
                System.out.println("Event: " + entry.getKey() + " | Attendees: " + entry.getValue());
            }
        }
    }
}
