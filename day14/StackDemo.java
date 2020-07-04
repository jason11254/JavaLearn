/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day14;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("John");
        stack.push("Mary");
        stack.push("Tom");
        System.out.println(stack);
        while (!stack.isEmpty()) {            
            System.out.printf("%s 出去, 還剩: %s\n", stack.pop(), stack);
        }
        System.out.println(stack);
    }
}