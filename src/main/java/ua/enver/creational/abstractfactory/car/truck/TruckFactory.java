package ua.enver.creational.abstractfactory.car.truck;

import ua.enver.creational.abstractfactory.car.Car;
import ua.enver.creational.abstractfactory.car.Factory;
import ua.enver.creational.abstractfactory.car.Truck;

/**
 * @author Enver on 15.05.2019 2:01.
 * @project patterns
 */
public class TruckFactory implements Factory {
    @Override
    public Car createCar(String typeOfCar) {
        return null;
    }

    public Truck createTruck(String typeOfTruck){
        switch (typeOfTruck){
            case "Mercedes": return new Mercedes();
            case "Reno": return new Reno();
            default: return null;
        }
    }
}
