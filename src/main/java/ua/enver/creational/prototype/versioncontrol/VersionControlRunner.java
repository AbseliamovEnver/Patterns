package ua.enver.creational.prototype.versioncontrol;

/**
 * @author Enver on 16.05.2019 17:15.
 * @project patterns
 */
public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();");

        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        System.out.println("\n==================================\n");
        System.out.println(masterClone);
    }
}
