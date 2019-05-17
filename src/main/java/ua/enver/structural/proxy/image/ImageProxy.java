package ua.enver.structural.proxy.image;

/**
 * @author Enver on 18.05.2019 0:27.
 * @project patterns
 */
public class ImageProxy {
    public static void main(String[] args) {
        Image image = new ProxyImage("C:/image.jpg");

        image.display();
    }
}
