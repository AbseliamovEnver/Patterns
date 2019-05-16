package ua.enver.creational.builder.car;

/**
 * @author Enver on 16.05.2019 0:36.
 * @project patterns
 */
public class AudiBuilder extends CarBuilder {
    @Override
    void buildModel() {
        car.setModel("Audi A8");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(260);
    }
}
