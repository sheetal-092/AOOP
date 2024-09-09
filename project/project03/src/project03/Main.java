package project03;

public class Main {
	public static void main(String[] args) {
       
		 // User Management
        UserManager userManager = new UserManager();
        userManager.addUser("Alice");
        userManager.addUser("Bob");
        userManager.addUser("Charlie");

        // Retrieve users
        User alice = userManager.getUser("Alice");
        User bob = userManager.getUser("Bob");

        // Video Call Management
        VideoCallManager videoCallManager = new VideoCallManager();
        videoCallManager.startCall(alice);  // Alice joins the call
        videoCallManager.startCall(bob);    // Bob joins the call
        videoCallManager.listParticipants(); // List participants

        videoCallManager.endCall(alice);    // Alice leaves the call
        videoCallManager.listParticipants(); // List participants again

        // Meeting Scheduler
        MeetingScheduler meetingScheduler = new MeetingScheduler();
        meetingScheduler.scheduleMeeting("Team Sync-up");
        meetingScheduler.scheduleMeeting("Project Kickoff");
        meetingScheduler.listMeetings(); // List scheduled meetings
    }

}
