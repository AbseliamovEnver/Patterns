package ua.enver.structural.proxy.image;

/**
 * @author Enver on 18.05.2019 0:19.
 * @project patterns
 */
public class ProxyImage implements Image {

    String file;
    RealImage realImage;

    public ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if (realImage == null){
            realImage = new RealImage(file);
        }
        realImage.display();
    }
}
