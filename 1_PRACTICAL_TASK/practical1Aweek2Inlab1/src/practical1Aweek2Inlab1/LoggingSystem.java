package practical1Aweek2Inlab1;

public class LoggingSystem {
public static void main(String[] args) {
        
        Logger logger1 = Logger.getInstance();
        logger1.log("First log entry.");

        
        Logger logger2 = Logger.getInstance();
        logger2.log("Second log entry.");

        
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        }
    }
}
