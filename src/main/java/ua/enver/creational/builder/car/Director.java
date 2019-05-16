package ua.enver.creational.builder.car;

/**
 * @author Enver on 16.05.2019 0:38.
 * @project patterns
 */
public class Director {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car BuildCar() {
        builder.createCar();
        builder.buildModel();
        builder.buildTransmission();
        builder.buildMaxSpeed();

        Car car = builder.getCar();

        return car;
    }
}
