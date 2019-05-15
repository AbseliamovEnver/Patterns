package ua.enver.structural.decorator.developer;

/**
 * @author Enver on 13.05.2019 17:11.
 * @project patterns
 */
public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new JavaSeniorDeveloper(new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
