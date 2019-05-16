package ua.enver.structural.adapter.drawshape;

/**
 * @author Enver on 17.05.2019 0:33.
 * @project patterns
 */
public class AdapterVectorToRasterExtends extends RasterGraphics implements VectorGraphicsInterface {
    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
