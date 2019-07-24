package chain;

public class ChainDemo {
    public static void main(String[] args) {
        AbstractLogger logger = getChainOfLoggers();

//        logger.logMessage(AbstractLogger.INFO, "this is an info log");
//        logger.logMessage(AbstractLogger.DEBUG, "this is an debug log");
        logger.logMessage(AbstractLogger.ERROR, "this is an error log");
    }

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
