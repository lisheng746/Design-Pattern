package com.lisheng.dp.mediator.main;

import java.util.Date;

/**
 * Created by lisheng on 2018/3/10.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
