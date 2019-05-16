package ua.enver.creational.builder.car;

/**
 * @author Enver on 15.05.2019 23:41.
 * @project patterns
 */
public class SimpleCarBuilder {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new MercedesBuilder());

        Car car = director.BuildCar();

        System.out.println(car);
    }
}
