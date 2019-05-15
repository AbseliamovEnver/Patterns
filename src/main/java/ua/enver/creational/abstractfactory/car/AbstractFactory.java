package ua.enver.creational.abstractfactory.car;

import ua.enver.creational.abstractfactory.car.passenger.CarFactory;
import ua.enver.creational.abstractfactory.car.truck.TruckFactory;

/**
 * @author Enver on 15.05.2019 2:13.
 * @project patterns
 */
public class AbstractFactory {
    Factory createFactory(String typeOfFactory){
        switch (typeOfFactory){
            case "Car": return new CarFactory();
            case "Truck": return new TruckFactory();
            default: return null;
        }
    }
}
