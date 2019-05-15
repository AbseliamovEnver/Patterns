package ua.enver.creational.abstractfactory.car;

/**
 * @author Enver on 15.05.2019 2:08.
 * @project patterns
 */
public interface Factory {
    Car createCar(String typeOfCar);
    Truck createTruck(String typeOfTruck);
}
