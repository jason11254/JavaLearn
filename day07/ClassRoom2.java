/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author MB-study
 */
public class ClassRoom2 {
    public static void main(String[] args) throws FileNotFoundException {
        //抓取JavaExam.csv資料
        File file=new File("src\\main\\java\\com\\lab\\ocp\\day07\\JavaExam.csv");
        Scanner sc=new Scanner(file);
        String data=sc.useDelimiter("\\A").next();
        //System.out.println(data);
        String[] rows=data.split("\r\n");
        System.out.println(rows[0]);
        String[] row=rows[0].split(",");
        System.out.println(row[0]);//學生名
        System.out.println(row[1]);//考試代號
        System.out.println(row[2]);//考試分數
        Exam exam = new Exam();
        exam.setName(row[1]);
        exam.setScore(Integer.parseInt(row[2]));
        Student student=new Student();
        student.setName(row[0]);
        student.setTest(exam);
        System.out.println(student);
    }
}
