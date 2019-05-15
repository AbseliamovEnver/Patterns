package ua.enver.creational.builder.website;

/**
 * @author Enver on 15.05.2019 18:46.
 * @project patterns
 */
public class Director {
    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    Website buildWebsite() {
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        Website website = builder.getWebsite();

        return website;
    }
}
