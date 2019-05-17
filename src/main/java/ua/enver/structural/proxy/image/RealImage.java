package ua.enver.structural.proxy.image;

/**
 * @author Enver on 18.05.2019 0:14.
 * @project patterns
 */
public class RealImage implements Image {

    String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    void load(){
        System.out.println("Loading " + file + "...");
    }

    @Override
    public void display() {
        System.out.println("Viewing " + file + "...");
    }
}
