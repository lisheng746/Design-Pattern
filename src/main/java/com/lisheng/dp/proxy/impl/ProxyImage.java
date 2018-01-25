package com.lisheng.dp.proxy.impl;

import com.lisheng.dp.proxy.intf.Image;

/**
 * Created by lisheng on 2018/1/25.
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
