package com.javaweb;

/**
 * Simple example of using "Adapter" pattern.
 * Here are two methods: using inheritance and composition
 *
 * @author Andrii Chernysh
 * @version 1.0, 27 Nov 2016
 */
public class AdapterPatternMain {
    public static void main(String[] args) {
        //Using inheritance
        VectorGraphicsInterface g1 = new VectorAdapterFromRaster();
        g1.drawLine();
        g1.drawSquare();

        //Using composition
        VectorGraphicsInterface g2 = new VectorAdapterFromRaster2(new RasterGraphics());
        g2.drawLine();
        g2.drawSquare();
    }
}

interface VectorGraphicsInterface {
    void drawLine();

    void drawSquare();
}

class RasterGraphics {
    void drawRasterLine() {
        System.out.println("Draw line");
    }

    void drawRasterSquare() {
        System.out.println("Draw square");
    }
}

class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface {
    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}

class VectorAdapterFromRaster2 implements VectorGraphicsInterface {
    RasterGraphics graphics;

    public VectorAdapterFromRaster2(RasterGraphics graphics) {
        this.graphics = graphics;
    }

    @Override
    public void drawLine() {
        graphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        graphics.drawRasterSquare();
    }
}