package ua.enver.creational.builder.website;

/**
 * @author Enver on 15.05.2019 16:58.
 * @project patterns
 */
public class EnterpriseWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprise web site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
