package ua.enver.structural.proxy.project;

/**
 * @author Enver on 17.05.2019 23:17.
 * @project patterns
 */
public class ProxyProject implements Project {
    private String url;
    private RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (realProject == null){
            realProject = new RealProject(url);
        }
        realProject.run();
    }
}
