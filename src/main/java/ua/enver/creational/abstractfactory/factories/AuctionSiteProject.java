package ua.enver.creational.abstractfactory.factories;

import ua.enver.creational.abstractfactory.factories.website.WebsiteTeamFactory;

/**
 * @author Enver on 15.05.2019 1:17.
 * @project patterns
 */
public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating auction website...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
