/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day18;

import java.util.stream.IntStream;

/**
 *
 * @author MB-study
 */
class BigData {

    StringBuffer sb;

    {
        sb = new StringBuffer();
        IntStream.rangeClosed(1, 3000_0000)
                .forEach((i) -> sb.append(i));
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("BigData 功成身退, 被回收了");
    }
}

public class GCDemo {

    public static void main(String[] args) {
        Long free = Runtime.getRuntime().freeMemory();
        System.out.printf("free: %d bytes\n", free);
        BigData bigData = new BigData();
        System.out.println("建立bigdata");
        free = Runtime.getRuntime().freeMemory();
        System.out.printf("free: %d bytes\n", free);
        bigData = null;
        System.gc();
        System.out.println("清除釋放記憶體");
        free = Runtime.getRuntime().freeMemory();
        System.out.printf("free: %d bytes\n", free);
    }
}
