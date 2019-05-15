package ua.enver.creational.factory.developer;

/**
 * @author Enver on 14.05.2019 19:17.
 * @project patterns
 */
public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
