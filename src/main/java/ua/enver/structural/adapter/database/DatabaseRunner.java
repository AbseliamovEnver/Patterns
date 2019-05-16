package ua.enver.structural.adapter.database;

/**
 * @author Enver on 16.05.2019 20:17.
 * @project patterns
 */
public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
