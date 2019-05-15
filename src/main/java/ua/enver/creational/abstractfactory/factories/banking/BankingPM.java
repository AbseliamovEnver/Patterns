package ua.enver.creational.abstractfactory.factories.banking;

import ua.enver.creational.abstractfactory.factories.ProjectManager;

/**
 * @author Enver on 15.05.2019 0:57.
 * @project patterns
 */
public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
