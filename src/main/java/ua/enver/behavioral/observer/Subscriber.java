package ua.enver.behavioral.observer;

import java.util.List;

/**
 * @author Enver on 22.05.2019 13:31.
 * @project patterns
 */
public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\nWe have some changes in vacancies:\n" + vacancies +
                "\n=============================================================\n");
    }
}
