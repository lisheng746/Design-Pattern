package com.lisheng.dp.command.impl;

import com.lisheng.dp.command.intf.Order;
import com.lisheng.dp.command.main.Stock;

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
