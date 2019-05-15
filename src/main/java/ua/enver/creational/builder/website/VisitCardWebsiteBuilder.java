package ua.enver.creational.builder.website;

/**
 * @author Enver on 15.05.2019 16:54.
 * @project patterns
 */
public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
