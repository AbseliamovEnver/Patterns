package ua.enver.creational.abstractfactory.factories.website;

import ua.enver.creational.abstractfactory.factories.Tester;

/**
 * @author Enver on 15.05.2019 1:05.
 * @project patterns
 */
public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
