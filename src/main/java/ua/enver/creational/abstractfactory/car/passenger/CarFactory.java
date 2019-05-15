package ua.enver.creational.abstractfactory.car.passenger;

import ua.enver.creational.abstractfactory.car.Car;
import ua.enver.creational.abstractfactory.car.Factory;
import ua.enver.creational.abstractfactory.car.Truck;

/**
 * @author Enver on 15.05.2019 1:52.
 * @project patterns
 */
public class CarFactory implements Factory {
    public Car createCar(String typeOfCar){
        switch (typeOfCar){
            case "Toyota": return new Toyota();
            case "Audi": return new Audi();
            default: return null;
        }
    }

    @Override
    public Truck createTruck(String typeOfTruck) {
        return null;
    }
}
