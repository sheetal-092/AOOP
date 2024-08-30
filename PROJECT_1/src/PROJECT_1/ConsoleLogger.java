package PROJECT_1;

public class ConsoleLogger implements Observer {
	 @Override
	    public void update(Event event) {
	        System.out.println("ConsoleLogger: " + event.getMessage());
	    }
	}

	public class FileLogger implements Observer {
	    @Override
	    public void update(Event event) {
	        System.out.println("FileLogger: Writing to file - " + event.getMessage());
	        
	    }
}
