package CO1_PROJECT_1;

import java.util.ArrayList;
import java.util.List;

public class Meeting {
	private String meetingId;
    private String scheduledTime;
    private List<User> participants;

    public Meeting(String meetingId, String scheduledTime) {
        this.meetingId = meetingId;
        this.scheduledTime = scheduledTime;
        this.participants = new ArrayList<>();
    }

    public String getMeetingId() {
        return meetingId;
    }

    public String getScheduledTime() {
        return scheduledTime;
    }

    public void addParticipant(User user) {
        participants.add(user);
        System.out.println(user.getUsername() + " has been added to the meeting.");
    }

    public void removeParticipant(User user) {
        participants.remove(user);
        System.out.println(user.getUsername() + " has been removed from the meeting.");
    }

    public void startMeeting() {
        System.out.println("Meeting " + meetingId + " started at " + scheduledTime);
        for (User user : participants) {
            user.joinCall();
        }
    }

    public void endMeeting() {
        System.out.println("Meeting " + meetingId + " ended.");
        for (User user : participants) {
            user.leaveCall();
        }
    }
}
