package ua.enver.creational.abstractfactory.car;

/**
 * @author Enver on 15.05.2019 2:33.
 * @project patterns
 */
public class TruckDriveFactory {
    public static void main(String[] args) {
        Factory truckFactory = new AbstractFactory().createFactory("Truck");
        Truck mercedes = truckFactory.createTruck("Mercedes");
        Truck reno = truckFactory.createTruck("Reno");
        mercedes.drive();
        reno.drive();
    }
}