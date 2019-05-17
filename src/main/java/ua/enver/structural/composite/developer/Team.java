package ua.enver.structural.composite.developer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enver on 17.05.2019 3:35.
 * @project patterns
 */
public class Team {
    List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    public void createProject() {
        System.out.println("Team creates project...");
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
