package ua.enver.behavioral.visitor;

/**
 * @author Enver on 23.05.2019 23:39.
 * @project patterns
 */
public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior in Action...");
        project.beWritten(junior);

        System.out.println("\n================================\n");

        System.out.println("Senior in Action...");
        project.beWritten(senior);
    }
}
