/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MB-study
 */
public class Classroom3 {
    public static void main(String[] args) throws FileNotFoundException {
        //抓取JavaExam.csv資料
        File file=new File("src\\main\\java\\com\\lab\\ocp\\day07\\JavaExam.csv");
        Scanner sc=new Scanner(file);
        String data=sc.useDelimiter("\\A").next();
        //切割資料成一列一列
        String[] rows=data.split("\r\n");
        //建立student陣列
        Student[] students=new Student[rows.length];
        //輪詢並切割資料
        for(int i=0;i<rows.length;i++){
            String[] row = rows[i].split(",");
            //考試物件
            Exam exam=new Exam();
            exam.setName(row[1]);
            exam.setScore(Integer.parseInt(row[2]));
            //學生物件
            Student s=new Student();
            s.setName(row[0]);
            s.setTest(exam);
            students[i]=s;
        }
        //分析統計資料
        
        IntSummaryStatistics stat=Arrays.stream(students)
                .mapToInt(e -> e.getTest().getScore())
                .summaryStatistics();
        System.out.println(stat);
        for(Student s:students){
            if(s.getTest().getScore()==stat.getMax()){
                System.out.println("最高分 "+stat.getMax()+"分, 學生:"+s.getName());
                break;
            }
        }
        String nameMax=Arrays.stream(students)
                .filter(s->s.getTest().getScore()==stat.getMax())
                .findFirst()
                .get()
                .getName();
        System.out.println("最高分 "+stat.getMax()+"分, 學生:"+nameMax);
        String nameMin=Arrays.stream(students)
                .filter(s->s.getTest().getScore()==stat.getMin())
                .findFirst()
                .get()
                .getName();
        System.out.println("最低分 "+stat.getMin()+"分, 學生:"+nameMin);
        //通過考試的人有(>65分)
        Arrays.stream(students)
                .filter(s->s.getTest().getScore()>=65)
                .forEach(s->System.out.println(s.getName()+" "+s.getTest().getScore()));
        //通過考試的人平均分為?
        double avg=Arrays.stream(students)
                .filter(s->s.getTest().getScore()>=65)
                .mapToInt(s->s.getTest().getScore())
                .average()
                .getAsDouble();
        System.out.println("通過的平均成績為"+avg+"分");
    }
}
