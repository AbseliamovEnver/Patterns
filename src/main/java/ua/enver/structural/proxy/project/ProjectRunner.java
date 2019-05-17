package ua.enver.structural.proxy.project;

/**
 * @author Enver on 17.05.2019 23:30.
 * @project patterns
 */
public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/AbseliamovEnver/Patterns");

        project.run();
    }
}
