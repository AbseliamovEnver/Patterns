package ua.enver.creational.abstractfactory.car.truck;

import ua.enver.creational.abstractfactory.car.Truck;

/**
 * @author Enver on 15.05.2019 1:58.
 * @project patterns
 */
public class Mercedes implements Truck {
    @Override
    public void drive() {
        System.out.println("Truck Mercedes drive...");
    }
}
