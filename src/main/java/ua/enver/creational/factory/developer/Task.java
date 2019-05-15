package ua.enver.creational.factory.developer;

/**
 * @author Enver on 14.05.2019 18:36.
 * @project patterns
 */
public class Task {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("php");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty){
        if (specialty.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }else if (specialty.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        }else if (specialty.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        }else {
            throw new RuntimeException(specialty + " is unknown specialty.");
        }
    }
}
