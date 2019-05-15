package ua.enver.creational.factory.car;

/**
 * @author Enver on 14.05.2019 20:06.
 * @project patterns
 */
public class CarDrive {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car audi = factory.create("Audi");
        Car toyota = factory.create("Toyota");
        audi.drive();
        toyota.drive();
    }
}
