package ua.enver.structural.adapter.drawshape;

/**
 * @author Enver on 17.05.2019 0:39.
 * @project patterns
 */
public class AdapterApplication {
    public static void main(String[] args) {
//        implementation through extends
        VectorGraphicsInterface graphic = new AdapterVectorToRasterExtends();
        graphic.drawLine();
        graphic.drawSquare();

//        implementation through composition
        VectorGraphicsInterface graphic2 = new AdapterVectorToRasterComposit(new RasterGraphics());
        graphic2.drawLine();
        graphic2.drawSquare();
    }
}
