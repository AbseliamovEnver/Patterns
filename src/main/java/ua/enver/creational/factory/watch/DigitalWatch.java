package ua.enver.creational.factory.watch;

import java.util.Date;

/**
 * @author Enver on 14.05.2019 22:02.
 * @project patterns
 */
public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
