package ua.enver.behavioral.visitor;

/**
 * @author Enver on 23.05.2019 23:26.
 * @project patterns
 */
public class Database implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
