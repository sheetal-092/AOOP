package practical5Bwek6Postlab1;

public class SMSService implements MessageService {
	 @Override
	    public void sendMessage(String message) {
	        System.out.println("Sending SMS: " + message);
	    }
}
