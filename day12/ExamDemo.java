/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day12;

import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.stream.Collectors.partitioningBy;

/**
 *
 * @author MB-study
 */
public class ExamDemo {
    public static void main(String[] args) {
        Exam e1=new Exam("國文", 100);
        Exam e2=new Exam("英文", 80);
        Exam e3=new Exam("數學", 100);
        Set<Exam> exams=new HashSet();
        exams.add(e1);
        exams.add(e2);
        exams.add(e3);

        IntSummaryStatistics stat= exams.stream().mapToInt(s->s.getScore())
                            .summaryStatistics();
        System.out.println("總分:"+stat.getSum());
        System.out.printf("平均:%.2f\r\n",stat.getAverage());
        exams.stream().filter(s->s.getScore()==stat.getMax())
                .peek(s->System.out.println("最高分為"+s.getSubject()+" 分數:"+stat.getMax()))
                .findAny();
        exams.stream().filter(s->s.getScore()==stat.getMin())
                .peek(s->System.out.println("最低分為"+s.getSubject()+" 分數:"+stat.getMin()))
                .findAny();
        System.out.println(exams.stream().collect(partitioningBy(e -> e.getScore()>=60)));
        Map<Boolean, List<Exam>> map = exams.stream().collect(partitioningBy(e -> e.getScore() >= 60));
        System.out.println(map);
    }
}
