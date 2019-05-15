package ua.enver.creational.abstractfactory.factories.website;

import ua.enver.creational.abstractfactory.factories.ProjectManager;

/**
 * @author Enver on 15.05.2019 1:08.
 * @project patterns
 */
public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
