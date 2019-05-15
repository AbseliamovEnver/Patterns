package ua.enver.creational.abstractfactory.car.truck;

import ua.enver.creational.abstractfactory.car.Truck;

/**
 * @author Enver on 15.05.2019 2:00.
 * @project patterns
 */
public class Reno implements Truck {
    @Override
    public void drive() {
        System.out.println("Truck Reno drive...");
    }
}
