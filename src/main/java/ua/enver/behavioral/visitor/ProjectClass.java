package ua.enver.behavioral.visitor;

/**
 * @author Enver on 23.05.2019 23:25.
 * @project patterns
 */
public class ProjectClass implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
