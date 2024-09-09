package project01;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Observer {
	 private String fileName;

	    public FileLogger(String fileName) {
	        this.fileName = fileName;
	    }

	    @Override
	    public void update(String event) {
	        try (FileWriter writer = new FileWriter(fileName, true)) {
	            writer.write("FileLogger - Event Logged: " + event + "\n");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
