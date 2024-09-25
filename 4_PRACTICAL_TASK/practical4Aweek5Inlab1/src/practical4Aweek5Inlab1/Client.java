package practical4Aweek5Inlab1;

public class Client {
	public static void main(String[] args) {
        
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();
        
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);
        
       
        Logger logger = new Logger();
        logger.addCommand(new LogCommand(infoHandler));

       
        logger.executeAll();
    }
}
