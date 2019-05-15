package ua.enver.creational.singleton.classic;

/**
 * @author Enver on 15.05.2019 14:50.
 * @project patterns
 */
public class Singleton {
    static Singleton singleton = new Singleton();
    int i = 0;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
