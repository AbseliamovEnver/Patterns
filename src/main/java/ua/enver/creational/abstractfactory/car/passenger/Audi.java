package ua.enver.creational.abstractfactory.car.passenger;

import ua.enver.creational.abstractfactory.car.Car;

/**
 * @author Enver on 15.05.2019 1:50.
 * @project patterns
 */
public class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("Audi drive...");
    }
}
