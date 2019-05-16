package ua.enver.structural.adapter.database;

/**
 * @author Enver on 16.05.2019 20:30.
 * @project patterns
 */
public class AdapterJavaToDatabase extends JavaApplication implements Database {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
