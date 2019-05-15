package ua.enver.creational.factory.developer;

/**
 * @author Enver on 14.05.2019 19:41.
 * @project patterns
 */
public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
