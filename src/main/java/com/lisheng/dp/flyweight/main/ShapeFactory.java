package com.lisheng.dp.flyweight.main;

import com.lisheng.dp.flyweight.impl.Circle;
import com.lisheng.dp.flyweight.intf.Shape;

import java.util.HashMap;

/**
 * Created by lisheng on 2018/1/25.
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
