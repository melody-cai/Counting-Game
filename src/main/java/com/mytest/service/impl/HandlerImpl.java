package com.mytest.service.impl;

import com.mytest.service.Handler;

import java.util.function.Predicate;

/**
 * @Author: melody
 * @Date: 2019/3/4
 * @Version 1.0
 */
public class HandlerImpl implements Handler {
    @Override
    public String checkNum(Integer number, Predicate<Integer> predicate1, Predicate<Integer> predicate2) {
        if (predicate1.test(number)) {
            if (predicate2.test(number)) {
                return "FizzBuzz";
            }
            return "Fizz";
        } else if (predicate2.test(number)) {
            return "Buzz";
        } else {
            return number.toString();
        }
    }
}
