package ua.enver.behavioral.strategy;

/**
 * @author Enver on 22.05.2019 23:23.
 * @project patterns
 */
public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Developer sleeping...");
    }
}
