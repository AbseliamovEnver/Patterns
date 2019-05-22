package ua.enver.behavioral.state;

/**
 * @author Enver on 22.05.2019 22:03.
 * @project patterns
 */
public class DeveloperActivity {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Developer developer = new Developer();

        developer.setActivity(activity);

        for (int i = 0; i < 6; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
