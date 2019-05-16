package ua.enver.structural.bridge.carsbridge;

/**
 * @author Enver on 17.05.2019 2:50.
 * @project patterns
 */
public class CarBridge {
    public static void main(String[] args) {
        CarAbstract car = new Sedan(new Audi());
        CarAbstract car2 = new Hatchback(new Mercedes());

        car.showDetails();
        car2.showDetails();
    }
}
