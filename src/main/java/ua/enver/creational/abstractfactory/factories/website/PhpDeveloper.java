package ua.enver.creational.abstractfactory.factories.website;

import ua.enver.creational.abstractfactory.factories.Developer;

/**
 * @author Enver on 15.05.2019 1:03.
 * @project patterns
 */
public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
