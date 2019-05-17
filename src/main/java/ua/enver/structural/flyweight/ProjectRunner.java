package ua.enver.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enver on 17.05.2019 19:41.
 * @project patterns
 */
public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("c++"));
        developers.add(developerFactory.getDeveloperBySpecialty("c++"));

        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
