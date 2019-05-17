package ua.enver.structural.composite.shapecomposite;

/**
 * @author Enver on 17.05.2019 4:16.
 * @project patterns
 */
public class ShapeComposite {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape circle = new Circle();

        Composite composite = new Composite();

        composite.addShape(triangle);
        composite.addShape(circle);

        composite.draw();
    }
}
