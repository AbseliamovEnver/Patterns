package ua.enver.behavioral.strategy;

/**
 * @author Enver on 22.05.2019 23:20.
 * @project patterns
 */
public class Reading implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Developer reading...");
    }
}
