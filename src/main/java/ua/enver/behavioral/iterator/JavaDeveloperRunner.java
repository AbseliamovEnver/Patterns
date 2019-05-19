package ua.enver.behavioral.iterator;

/**
 * @author Enver on 20.05.2019 1:07.
 * @project patterns
 */
public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PesgreSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Enver", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.print("\t\t" + iterator.next().toString() + "\n");
        }
    }
}
