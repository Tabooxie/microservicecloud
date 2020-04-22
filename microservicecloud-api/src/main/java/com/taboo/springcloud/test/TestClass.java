package com.taboo.springcloud.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestClass {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");
        map.put("d","4");
        map.put("e","5");
        Iterator<Map.Entry> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = iterator.next();
            System.out.print(entry.getKey());
            System.out.println(entry.getValue());
        }


    }
}
