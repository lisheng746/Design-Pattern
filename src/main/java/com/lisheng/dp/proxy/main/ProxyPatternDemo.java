package com.lisheng.dp.proxy.main;

import com.lisheng.dp.proxy.impl.ProxyImage;
import com.lisheng.dp.proxy.intf.Image;

/**
 * Created by lisheng on 2018/1/25.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //图像将从磁盘加载
        image.display();
        System.out.println("");
        //图像将无法从磁盘加载
        image.display();
    }
}
