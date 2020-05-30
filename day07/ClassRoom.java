/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day07;

/**
 *
 * @author MB-study
 */
public class ClassRoom {
    public static void main(String[] args) {
        Teacher t=new Teacher("Tom");
        
        Student s1=new Student("Som");
        Exam exam1=new Exam("1z0-808", 69);
        s1.setTest(exam1);
        
        Student s2=new Student("Jom");
        Exam exam2=new Exam("1z0-808", 77);
        s2.setTest(exam2);
        
        Student s3=new Student("Bom");
        Exam exam3=new Exam("1z0-808", 92);
        s3.setTest(exam3);
        
        System.out.println(t);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
