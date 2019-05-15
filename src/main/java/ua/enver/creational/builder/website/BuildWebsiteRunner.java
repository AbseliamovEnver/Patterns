package ua.enver.creational.builder.website;

/**
 * @author Enver on 15.05.2019 18:50.
 * @project patterns
 */
public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new VisitCardWebsiteBuilder());
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
