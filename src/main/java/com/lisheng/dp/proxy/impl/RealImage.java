package com.lisheng.dp.proxy.impl;

import com.lisheng.dp.proxy.intf.Image;

/**
 * Created by lisheng on 2018/1/25.
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
