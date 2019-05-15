package ua.enver.creational.abstractfactory.factories.banking;

import ua.enver.creational.abstractfactory.factories.Developer;

/**
 * @author Enver on 15.05.2019 0:46.
 * @project patterns
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
