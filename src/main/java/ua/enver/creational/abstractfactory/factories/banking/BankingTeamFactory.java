package ua.enver.creational.abstractfactory.factories.banking;

import ua.enver.creational.abstractfactory.factories.Developer;
import ua.enver.creational.abstractfactory.factories.ProjectManager;
import ua.enver.creational.abstractfactory.factories.ProjectTeamFactory;
import ua.enver.creational.abstractfactory.factories.Tester;

/**
 * @author Enver on 15.05.2019 0:51.
 * @project patterns
 */
public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
