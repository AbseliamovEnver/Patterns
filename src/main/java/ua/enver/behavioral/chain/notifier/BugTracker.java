package ua.enver.behavioral.chain.notifier;

/**
 * @author Enver on 18.05.2019 3:01.
 * @project patterns
 */
public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifire = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifire = new EmailNotifire(Priority.IMPORTANT);
        Notifier smsNotifire = new SMSNotifire(Priority.ASAP);

        reportNotifire.setNextNotifier(emailNotifire);
        emailNotifire.setNextNotifier(smsNotifire);

        reportNotifire.notifyManager("Everything is OK.", Priority.ROUTINE);
        reportNotifire.notifyManager("Something went wrong!", Priority.IMPORTANT);
        reportNotifire.notifyManager("Houston, we've had a problem here!!!", Priority.ASAP);
    }
}
