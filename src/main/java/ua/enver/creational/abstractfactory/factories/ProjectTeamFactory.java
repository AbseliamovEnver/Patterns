package ua.enver.creational.abstractfactory.factories;

/**
 * @author Enver on 15.05.2019 0:37.
 * @project patterns
 */
public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
