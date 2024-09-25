package practical5Bwek6Postlab1;

public class EmailService implements MessageService {
	 @Override
	    public void sendMessage(String message) {
	        System.out.println("Sending Email: " + message);
	    }
}
