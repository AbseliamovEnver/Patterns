package ua.enver.behavioral.chain.notifier;

/**
 * @author Enver on 18.05.2019 2:52.
 * @project patterns
 */
public class EmailNotifire extends Notifier {

    public EmailNotifire(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: " + message);
    }
}
