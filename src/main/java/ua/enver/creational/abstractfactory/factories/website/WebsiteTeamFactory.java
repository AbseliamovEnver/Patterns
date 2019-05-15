package ua.enver.creational.abstractfactory.factories.website;

import ua.enver.creational.abstractfactory.factories.Developer;
import ua.enver.creational.abstractfactory.factories.ProjectManager;
import ua.enver.creational.abstractfactory.factories.ProjectTeamFactory;
import ua.enver.creational.abstractfactory.factories.Tester;

/**
 * @author Enver on 15.05.2019 1:12.
 * @project patterns
 */
public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
