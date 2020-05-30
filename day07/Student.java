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
public class Student extends Person{
    private Exam test;

    public Student() {
    }

    public Student(Exam test) {
        this.test = test;
    }

    public Student(Exam test, String name) {
        super(name);
        this.test = test;
    }

    public Exam getTest() {
        return test;
    }

    public void setTest(Exam test) {
        this.test = test;
    }

    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Student{" +"name="+getName()+" test=" + test + '}';
    }
        
}
