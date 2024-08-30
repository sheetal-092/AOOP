package CO1_PROJECT_1;

public class VideoConferencingToolTest {
	 public static void main(String[] args) {
	     
	        User user1 = new User("Alice");
	        User user2 = new User("Bob");
	        User user3 = new User("Charlie");

	     
	        Meeting meeting = new Meeting("1234", "10:00 AM");

	        
	        meeting.addParticipant(user1);
	        meeting.addParticipant(user2);

	       
	        meeting.startMeeting();

	       
	        System.out.println("Is Alice in call? " + user1.isInCall());
	        System.out.println("Is Bob in call? " + user2.isInCall());
	        System.out.println("Is Charlie in call? " + user3.isInCall());

	       
	        meeting.removeParticipant(user1);
	        meeting.endMeeting();
	    }
}
