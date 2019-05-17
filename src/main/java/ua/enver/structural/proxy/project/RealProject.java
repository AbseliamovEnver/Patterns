package ua.enver.structural.proxy.project;

import ua.enver.structural.proxy.project.Project;

/**
 * @author Enver on 17.05.2019 21:44.
 * @project patterns
 */
public class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Loading project from " + url + "...");
    }

    @Override
    public void run() {
        System.out.println("Running project " + url + "...");
    }
}
