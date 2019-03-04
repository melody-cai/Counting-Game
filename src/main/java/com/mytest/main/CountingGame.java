package com.mytest.main;

import com.mytest.service.Handler;
import com.mytest.service.impl.HandlerImpl;
import com.mytest.utils.Utils;

/**
 * @Author: melody
 * @Date: 2019/3/4
 * @Version 1.0
 */
public class CountingGame {
    public static void main(String[] args) {
        int start = Integer.valueOf(Utils.properties.getProperty("start"));
        int end =  Integer.valueOf(Utils.properties.getProperty("end"));
        int number1 = Integer.valueOf(Utils.properties.getProperty("number1"));
        int number2 = Integer.valueOf(Utils.properties.getProperty("number2"));
        for (int i = start; i <= end; i++) {
            Handler handler = new HandlerImpl();
            System.out.println(handler.checkNum(i, n -> n % number1 == 0, n -> n % number2 == 0));
        }
    }


}