package ua.enver.creational.builder.car;

/**
 * @author Enver on 15.05.2019 23:46.
 * @project patterns
 */
public abstract class CarBuilder {
    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void buildModel();

    abstract void buildTransmission();

    abstract void buildMaxSpeed();

    Car getCar() {
        return car;
    }
}
