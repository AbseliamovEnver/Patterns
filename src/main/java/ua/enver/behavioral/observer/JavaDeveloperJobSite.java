package ua.enver.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enver on 22.05.2019 13:35.
 * @project patterns
 */
public class JavaDeveloperJobSite implements Observed {
    List<String> vacancies = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(this.vacancies);
        }
    }
}
