package ua.enver.behavioral.template;

/**
 * @author Enver on 23.05.2019 0:26.
 * @project patterns
 */
public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();

        System.out.println("\n=======================================\n");

        newsPage.showPage();
    }
}
