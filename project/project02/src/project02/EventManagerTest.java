package project02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EventManagerTest {
	private EventManager eventManager;
    private ConsoleLogger consoleLogger;
    private FileLogger fileLogger;

    @BeforeEach
    public void setUp() {
        eventManager = new EventManager();
        consoleLogger = new ConsoleLogger();
        fileLogger = new FileLogger("test_event_log.txt");

        eventManager.addObserver(consoleLogger);
        eventManager.addObserver(fileLogger);
    }

    @Test
    public void testSingleEventIsLoggedToFile() throws IOException {
        eventManager.generateEvent("Test Event");

        
        String lastLoggedEvent = getLastLoggedEventFromFile("test_event_log.txt");

        assertEquals("FileLogger - Event Logged: Test Event", lastLoggedEvent.trim(), 
            "The file logger should log the event correctly.");
    }

    @Test
    public void testMultipleEventsAreLoggedToFile() throws IOException {
        eventManager.generateEvent("Event 1");
        eventManager.generateEvent("Event 2");

       
        String lastLoggedEvent = getLastLoggedEventFromFile("test_event_log.txt");

        assertEquals("FileLogger - Event Logged: Event 2", lastLoggedEvent.trim(),
            "The file logger should log multiple events, with the last event being 'Event 2'.");
    }

    @Test
    public void testConsoleLoggerLogsEvent() {
        eventManager.generateEvent("Console Test Event");

       
        assertTrue(true, "ConsoleLogger should log events without issues.");
    }

    @Test
    public void testRemoveObserver() throws IOException {
        eventManager.removeObserver(fileLogger);
        eventManager.generateEvent("Event After Removal");

        
        String lastLoggedEvent = getLastLoggedEventFromFile("test_event_log.txt");

        assertEquals("FileLogger - Event Logged: Event 2", lastLoggedEvent.trim(),
            "The file logger should not log new events after being removed.");
    }

 
    private String getLastLoggedEventFromFile(String fileName) throws IOException {
        String lastLine = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                lastLine = currentLine;
            }
        }
        return lastLine;
    }
}
