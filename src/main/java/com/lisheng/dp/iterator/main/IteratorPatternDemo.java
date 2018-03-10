package com.lisheng.dp.iterator.main;

import com.lisheng.dp.iterator.impl.NameRepository;
import com.lisheng.dp.iterator.intf.Iterator;

/**
 * Created by lisheng on 2018/3/10.
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
