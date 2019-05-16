package ua.enver.structural.bridge.carsbridge;

/**
 * @author Enver on 17.05.2019 2:49.
 * @project patterns
 */
public class Hatchback extends CarAbstract {

    public Hatchback(Make make) {
        super(make);
    }

    @Override
    void showType() {
        System.out.print("Car body is Hatchback...");
    }
}
