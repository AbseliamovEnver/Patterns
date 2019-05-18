package ua.enver.behavioral.chain.logger;

/**
 * @author Enver on 18.05.2019 20:41.
 * @project patterns
 */
public class EmailLogger extends Logger {

    public EmailLogger(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Email logger " + message + "...");
    }
}
