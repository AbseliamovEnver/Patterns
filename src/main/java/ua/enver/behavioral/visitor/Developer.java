package ua.enver.behavioral.visitor;

/**
 * @author Enver on 23.05.2019 23:27.
 * @project patterns
 */
public interface Developer {
    void create(ProjectClass projectClass);

    void create(Database database);

    void create(Test test);
}
