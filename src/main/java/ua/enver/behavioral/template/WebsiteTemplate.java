package ua.enver.behavioral.template;

/**
 * @author Enver on 23.05.2019 0:23.
 * @project patterns
 */
public abstract class WebsiteTemplate {
    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}
