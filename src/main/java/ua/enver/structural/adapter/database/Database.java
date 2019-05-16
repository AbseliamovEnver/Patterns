package ua.enver.structural.adapter.database;

/**
 * @author Enver on 16.05.2019 20:19.
 * @project patterns
 */
public interface Database {

    void insert();

    void update();

    void select();

    void remove();
}
