package ua.enver.creational.abstractfactory.factories.banking;

import ua.enver.creational.abstractfactory.factories.Tester;

/**
 * @author Enver on 15.05.2019 0:48.
 * @project patterns
 */
public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tests banking code...");
    }
}
