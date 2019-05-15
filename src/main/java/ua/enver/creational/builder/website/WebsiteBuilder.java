package ua.enver.creational.builder.website;

/**
 * @author Enver on 15.05.2019 16:49.
 * @project patterns
 */
public abstract class WebsiteBuilder {
    Website website;

    void createWebsite() {
        website = new Website();
    }

    abstract void buildName();

    abstract void buildCms();

    abstract void buildPrice();

    Website getWebsite() {
        return website;
    }
}
