package PROJECT_1;

public class FileLogger implements Observer{
	 @Override
	    public void update(Event event) {
	        System.out.println("FileLogger: Writing to file - " + event.getMessage());
	        // Here you would write the event message to a file
	    }
}
