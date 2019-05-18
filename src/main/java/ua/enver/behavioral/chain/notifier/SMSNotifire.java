package ua.enver.behavioral.chain.notifier;

/**
 * @author Enver on 18.05.2019 2:54.
 * @project patterns
 */
public class SMSNotifire extends Notifier {

    public SMSNotifire(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to manager: " + message);
    }
}
