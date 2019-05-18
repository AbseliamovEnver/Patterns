package ua.enver.behavioral.chain.logger;

/**
 * @author Enver on 18.05.2019 20:39.
 * @project patterns
 */
public class SMSLogger extends Logger {

    public SMSLogger(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("SMS message " + message + "...");
    }
}
