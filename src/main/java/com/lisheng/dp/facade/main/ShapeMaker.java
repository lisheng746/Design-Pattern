package com.lisheng.dp.facade.main;

import com.lisheng.dp.facade.impl.Circle;
import com.lisheng.dp.facade.impl.Rectangle;
import com.lisheng.dp.facade.impl.Square;
import com.lisheng.dp.facade.intf.Shape;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

}
