package project03;

import java.util.ArrayList;
import java.util.List;

public class VideoCallManager {
	
	private List<User> participants;

    public VideoCallManager() {
        participants = new ArrayList<>();
    }

    public void startCall(User user) {
        if (!participants.contains(user)) {
            participants.add(user);
            user.joinCall();
        } else {
            System.out.println(user.getUsername() + " is already in the call.");
        }
    }

    public void endCall(User user) {
        if (participants.contains(user)) {
            participants.remove(user);
            user.leaveCall();
        } else {
            System.out.println(user.getUsername() + " is not in the call.");
        }
    }

    public void listParticipants() {
        System.out.println("Participants in the call:");
        for (User user : participants) {
            System.out.println("- " + user.getUsername());
        }
    }

}
