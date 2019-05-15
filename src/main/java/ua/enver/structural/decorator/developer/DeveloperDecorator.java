package ua.enver.structural.decorator.developer;

/**
 * @author Enver on 13.05.2019 17:15.
 * @project patterns
 */
public class DeveloperDecorator implements Developer{

    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
