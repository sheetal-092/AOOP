package CO1_PROJECT_1;

public class User {
	 private String username;
	    private boolean inCall;

	    public User(String username) {
	        this.username = username;
	        this.inCall = false;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public boolean isInCall() {
	        return inCall;
	    }

	    public void joinCall() {
	        this.inCall = true;
	        System.out.println(username + " has joined the call.");
	    }

	    public void leaveCall() {
	        this.inCall = false;
	        System.out.println(username + " has left the call.");
	    }
}
