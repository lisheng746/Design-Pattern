package com.lisheng.dp.facade.impl;

import com.lisheng.dp.facade.intf.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
