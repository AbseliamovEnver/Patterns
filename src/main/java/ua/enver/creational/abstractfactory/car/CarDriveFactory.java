package ua.enver.creational.abstractfactory.car;

/**
 * @author Enver on 15.05.2019 1:47.
 * @project patterns
 */
public class CarDriveFactory {
    public static void main(String[] args) {
        Factory carFactory = new AbstractFactory().createFactory("Transmission");
        Car audi = carFactory.createCar("Audi");
        Car toyota = carFactory.createCar("Toyota");
        audi.drive();
        toyota.drive();
    }
}
