package ua.enver.creational.abstractfactory.car.passenger;

import ua.enver.creational.abstractfactory.car.Car;

/**
 * @author Enver on 15.05.2019 1:48.
 * @project patterns
 */
public class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("Toyota drive...");
    }
}
