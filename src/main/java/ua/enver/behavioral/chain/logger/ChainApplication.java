package ua.enver.behavioral.chain.logger;

/**
 * @author Enver on 18.05.2019 20:45.
 * @project patterns
 */
public class ChainApplication {
    public static void main(String[] args) {
        Logger logger = new SMSLogger(Level.ERROR);
        Logger logger2 = new FileLogger(Level.DEBUG);
        Logger logger3 = new EmailLogger(Level.INFO);

        logger.setNext(logger2);
        logger2.setNext(logger3);

        logger.writeMessage("Everything is OK ", Level.INFO);
        logger.writeMessage("Something is wrong", Level.DEBUG);
        logger.writeMessage("System Error", Level.ERROR);
    }
}
