package ua.enver.structural.bridge.carsbridge;

/**
 * @author Enver on 17.05.2019 2:42.
 * @project patterns
 */
public abstract class CarAbstract {

    Make make;

    public CarAbstract(Make make) {
        this.make = make;
    }

    abstract void showType();

    void showDetails() {
        showType();
        make.setMake();
    }
}
