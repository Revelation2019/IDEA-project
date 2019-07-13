package com;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        int i = 0;
        int count = 100;
        for (; i < count; i++) {
            System.out.println(Thread.currentThread().getName() +  i);
        }
        return i;
    }
}
