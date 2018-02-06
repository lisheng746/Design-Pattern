package com.lisheng.dp.command.impl;

import com.lisheng.dp.command.intf.Order;
import com.lisheng.dp.command.main.Stock;

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
