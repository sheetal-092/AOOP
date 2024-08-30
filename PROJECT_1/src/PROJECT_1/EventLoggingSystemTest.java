package PROJECT_1;

public class EventLoggingSystemTest {
	public static void main(String[] args) {
        
        Subject subject = new Subject();

        
        ConsoleLogger consoleLogger = new ConsoleLogger();
        FileLogger fileLogger = new FileLogger();

        
        subject.addObserver(consoleLogger);
        subject.addObserver(fileLogger);

        
        subject.generateEvent("Event 1");
        subject.generateEvent("Event 2");

        
        subject.removeObserver(consoleLogger);
        subject.generateEvent("Event 3");
    }
}
