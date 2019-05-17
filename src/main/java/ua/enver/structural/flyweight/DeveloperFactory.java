package ua.enver.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Enver on 17.05.2019 19:00.
 * @project patterns
 */
public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(String specialty) {
        Developer developer = developers.get(specialty);

        if (developer == null) {
            switch (specialty) {
                case "java":
                    System.out.println("Hiring Java developer...");
                    developer = new JavaDeveloper();
                    break;
                case "c++":
                    System.out.println("Hiring C++ developer...");
                    developer = new CppDeveloper();
                    break;
                default:
                    break;
            }
            developers.put(specialty, developer);
        }
        return developer;
    }
}
