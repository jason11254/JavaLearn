/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day14;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("John");
        queue.offer("Mary");
        queue.offer("Tom");
        System.out.println("排隊: " + queue);
        while (!queue.isEmpty()) {        
            String name = queue.poll();
            System.out.printf("%s 看診 目前排隊狀態: %s\n", name, queue);
        }
        System.out.println("排隊: " + queue);
    }
}