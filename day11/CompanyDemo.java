/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day11;

/**
 *
 * @author MB-study
 */
public class CompanyDemo {
    public static void main(String[] args) {
        Company c1=new Company();
        Company.Employee e1=c1.new Employee();
        e1.job();
        System.out.println(e1.getSalary());
        c1.printGoal();
    }
}
