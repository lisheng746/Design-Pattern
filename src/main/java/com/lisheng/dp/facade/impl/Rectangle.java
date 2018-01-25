package com.lisheng.dp.facade.impl;

import com.lisheng.dp.facade.intf.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
