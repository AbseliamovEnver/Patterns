package ua.enver.creational.factory.developer;

/**
 * @author Enver on 14.05.2019 19:40.
 * @project patterns
 */
public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes PHP code...");
    }
}
