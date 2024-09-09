package project01;

public class Main {
	public static void main(String[] args) {
        EventManager eventManager = new EventManager();

        
        Observer consoleLogger = new ConsoleLogger();
        Observer fileLogger = new FileLogger("event_log.txt");

      
        eventManager.addObserver(consoleLogger);
        eventManager.addObserver(fileLogger);

       
        eventManager.generateEvent("User logged in");
        eventManager.generateEvent("File uploaded");
    }

}
