package com.mytest.service;

import java.util.function.Predicate;

/**
 * @Author: melody
 * @Date: 2019/3/4
 * @Version 1.0
 */
public interface Handler {
    String checkNum(Integer number, Predicate<Integer> predicate1, Predicate<Integer> predicate2);
}
