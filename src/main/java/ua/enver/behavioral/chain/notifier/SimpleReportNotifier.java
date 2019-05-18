package ua.enver.behavioral.chain.notifier;

/**
 * @author Enver on 18.05.2019 2:48.
 * @project patterns
 */
public class SimpleReportNotifier extends Notifier {

    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report: " + message);
    }
}
