package ua.enver.behavioral.observer;

/**
 * @author Enver on 22.05.2019 13:23.
 * @project patterns
 */
public interface Observed {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
