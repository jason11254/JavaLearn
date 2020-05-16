/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day05;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;

/**
 *
 * @author MB-study
 */
public class ForLoopDemo5 {
    public static void main(String[] args) {
        int[][] exams={{100,90},{70,80},{40,100},{100,100},{80,50}};
        IntSummaryStatistics stat_ch=Arrays.stream(exams)
                                    .mapToInt(grade->grade[0])
                                    .summaryStatistics();
        System.out.println("國文平均:"+stat_ch.getAverage());
        IntSummaryStatistics stat_math=Arrays.stream(exams)
                                    .mapToInt(grade->grade[1])
                                    .summaryStatistics();
        System.out.println("數學平均:"+stat_math.getAverage());
        IntSummaryStatistics stat_grade=Arrays.stream(exams)
                                    .mapToInt(grade->(grade[0]+grade[1])/2)
                                    .summaryStatistics();
        System.out.println("班平均:"+stat_grade.getAverage());
        DoubleSummaryStatistics stat_grade2=Arrays.stream(exams)
                                    .mapToDouble(grade->Arrays.stream(grade).average().getAsDouble())
                                    .summaryStatistics();
        System.out.println("班平均:"+stat_grade2.getAverage());
        int count=(int)Arrays.stream(exams)
                        .flatMapToInt(grade->Arrays.stream(grade))
                        .filter(g->g==100)
                        .count();
        System.out.println("100分數量:"+count);
    }
}
