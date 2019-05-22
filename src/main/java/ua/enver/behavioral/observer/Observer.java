package ua.enver.behavioral.observer;

import java.util.List;

/**
 * @author Enver on 22.05.2019 13:20.
 * @project patterns
 */
public interface Observer {
    void handleEvent(List<String> vacancies);
}
