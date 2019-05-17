package ua.enver.structural.composite.shapecomposite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enver on 17.05.2019 4:11.
 * @project patterns
 */
public class Composite implements Shape {

    List<Shape> shapeList = new ArrayList<>();

    public void addShape(Shape shape) {
        shapeList.add(shape);
    }

    public void removeShape(Shape shape) {
        shapeList.remove(shape);
    }

    @Override
    public void draw() {
        for (Shape shape : shapeList) {
            shape.draw();
        }
    }
}
