package practical4Aweek5Inlab1;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface Command {
	void execute(String message, LogLevel level);
	}

	
	class LogCommand implements Command {
	    private LogHandler handler;
	    
	    public LogCommand(LogHandler handler) {
	        this.handler = handler;
	    }
	    
	    @Override
	    public void execute(String message, LogLevel level) {
	        handler.handleLog(message, level);
	    }
	}

	
	abstract class LogHandler {
	    protected LogHandler nextHandler;

	    public void setNextHandler(LogHandler nextHandler) {
	        this.nextHandler = nextHandler;
	    }

	    public abstract void handleLog(String message, LogLevel level);
	}

	
	class InfoHandler extends LogHandler {
	    @Override
	    public void handleLog(String message, LogLevel level) {
	        if (level == LogLevel.INFO) {
	            System.out.println("INFO: " + message);
	        } else if (nextHandler != null) {
	            nextHandler.handleLog(message, level);
	        }
	    }
	}

	class DebugHandler extends LogHandler {
	    @Override
	    public void handleLog(String message, LogLevel level) {
	        if (level == LogLevel.DEBUG) {
	            System.out.println("DEBUG: " + message);
	        } else if (nextHandler != null) {
	            nextHandler.handleLog(message, level);
	        }
	    }
	}

	class ErrorHandler extends LogHandler {
	    @Override
	    public void handleLog(String message, LogLevel level) {
	        if (level == LogLevel.ERROR) {
	            System.out.println("ERROR: " + message);
	        } else if (nextHandler != null) {
	            nextHandler.handleLog(message, level);
	        }
	    }
	}

	
	class Logger {
	    private List<Command> commands = new ArrayList<>();

	    public void addCommand(Command command) {
	        commands.add(command);
	    }

	    public void executeAll() {
	        Iterator<Command> iterator = commands.iterator();
	        while (iterator.hasNext()) {
	            Command command = iterator.next();
	            // Assuming we are logging different types of messages
	            command.execute("System is working fine.", LogLevel.INFO);
	            command.execute("System is in debug mode.", LogLevel.DEBUG);
	            command.execute("System encountered an error.", LogLevel.ERROR);
	        }
	    }
}
