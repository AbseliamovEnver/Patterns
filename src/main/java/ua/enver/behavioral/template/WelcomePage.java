package ua.enver.behavioral.template;

/**
 * @author Enver on 23.05.2019 0:25.
 * @project patterns
 */
public class WelcomePage extends WebsiteTemplate {
    @Override
    public void showPageContent() {
        System.out.println("Welcome!");
    }
}
