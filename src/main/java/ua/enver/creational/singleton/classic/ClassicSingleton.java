package ua.enver.creational.singleton.classic;

/**
 * @author Enver on 15.05.2019 14:49.
 * @project patterns
 */
public class ClassicSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton.i = 5;

        System.out.println(singleton2.i);
    }
}
