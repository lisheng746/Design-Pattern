package com.lisheng.dp.Iterator.impl;

import com.lisheng.dp.Iterator.intf.Container;
import com.lisheng.dp.Iterator.intf.Iterator;

/**
 * Created by lisheng on 2018/3/10.
 */
public class NameRepository implements Container {

    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
