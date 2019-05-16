package ua.enver.structural.bridge.carsbridge;

/**
 * @author Enver on 17.05.2019 2:45.
 * @project patterns
 */
public class Sedan extends CarAbstract {

    public Sedan(Make make) {
        super(make);
    }

    @Override
    void showType() {
        System.out.print("Car body is Sedan...");
    }
}
