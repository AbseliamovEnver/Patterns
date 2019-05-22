package ua.enver.behavioral.state;

/**
 * @author Enver on 22.05.2019 21:55.
 * @project patterns
 */
public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Developer sleeping...");
    }
}
