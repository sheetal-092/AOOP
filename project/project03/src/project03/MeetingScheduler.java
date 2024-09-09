package project03;

import java.util.ArrayList;
import java.util.List;

public class MeetingScheduler {
	private List<String> meetings;

    public MeetingScheduler() {
        meetings = new ArrayList<>();
    }

    public void scheduleMeeting(String meetingName) {
        meetings.add(meetingName);
        System.out.println("Meeting '" + meetingName + "' scheduled.");
    }

    public void listMeetings() {
        System.out.println("Scheduled meetings:");
        for (String meeting : meetings) {
            System.out.println("- " + meeting);
        }
    }

}
