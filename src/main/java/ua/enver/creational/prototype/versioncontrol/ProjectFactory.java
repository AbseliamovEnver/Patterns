package ua.enver.creational.prototype.versioncontrol;

/**
 * @author Enver on 16.05.2019 17:13.
 * @project patterns
 */
public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    Project cloneProject(){
        return (Project) project.copy();
    }
}
