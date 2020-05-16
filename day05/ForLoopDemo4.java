/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day05;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 *
 * @author MB-study
 */
public class ForLoopDemo4 {
    public static void main(String[] args) {
        String[] names={"John","Mary","Tom","Helen","Yuki"};
        int sum= Arrays.stream(names)
                    .filter(name->name.length()<=4)
                    .filter(name->name.contains("o"))
                    .mapToInt(name->name.length())
                    .sum();
                    //.forEach(name->System.out.print(name+" "));
        System.out.println("sum = "+sum);
        double avg=Arrays.stream(names)
                        .mapToInt(name->name.length())
                        .peek(System.out::print)
                        .average().getAsDouble();
                        //.forEach(name->System.out.print(name+" "));
        System.out.println();
        System.out.println("avg = "+avg);
        
        IntSummaryStatistics stat = Arrays.stream(names)
                .mapToInt(name->name.length())
                .summaryStatistics();
        System.out.println(stat);
        System.out.println(stat.getMax());
    }
}
