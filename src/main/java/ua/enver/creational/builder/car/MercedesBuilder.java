package ua.enver.creational.builder.car;

/**
 * @author Enver on 16.05.2019 0:34.
 * @project patterns
 */
public class MercedesBuilder extends CarBuilder {
    @Override
    void buildModel() {
        car.setModel("Mercedes lux");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(280);
    }
}
