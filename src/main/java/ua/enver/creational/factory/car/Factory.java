package ua.enver.creational.factory.car;

/**
 * @author Enver on 14.05.2019 20:13.
 * @project patterns
 */
public class Factory {
    public Car create(String typeOfCar) {
        switch (typeOfCar) {
            case "Audi":
                return new Audi();
            case "Toyota":
                return new Toyota();
            default:
                return null;
        }
    }
}
