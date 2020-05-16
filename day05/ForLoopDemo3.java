/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day05;

import java.util.Arrays;

/**
 *
 * @author MB-study
 */
public class ForLoopDemo3 {
    public static void main(String[] args) {
        String[] names={"John","Mary","Tom","Helen","Yuki"};
        Arrays.stream(names)
                .forEach(name->System.out.print(name+" "));
        System.out.println();
        for(String name:names){
            System.out.print(name+" ");
        }
        System.out.println();
    }
}
