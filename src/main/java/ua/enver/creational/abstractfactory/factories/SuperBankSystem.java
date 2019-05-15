package ua.enver.creational.abstractfactory.factories;

import ua.enver.creational.abstractfactory.factories.banking.BankingTeamFactory;

/**
 * @author Enver on 15.05.2019 1:18.
 * @project patterns
 */
public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
