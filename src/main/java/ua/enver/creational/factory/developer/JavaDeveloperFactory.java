package ua.enver.creational.factory.developer;

/**
 * @author Enver on 14.05.2019 19:15.
 * @project patterns
 */
public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
