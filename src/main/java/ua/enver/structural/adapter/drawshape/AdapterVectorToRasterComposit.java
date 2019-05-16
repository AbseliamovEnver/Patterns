package ua.enver.structural.adapter.drawshape;

/**
 * @author Enver on 17.05.2019 0:36.
 * @project patterns
 */
public class AdapterVectorToRasterComposit implements VectorGraphicsInterface {
    RasterGraphics rasterGraphics = new RasterGraphics();

    public AdapterVectorToRasterComposit(RasterGraphics rasterGraphics) {

    }

    @Override
    public void drawLine() {
        rasterGraphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }
}
