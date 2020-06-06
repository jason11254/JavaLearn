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
public class Company {
    private String name="ASUS";
    public void printGoal(){
        int year=2020;
        class Goal{
            void printYear(){
                System.out.printf("%d 願景\n",year);
            }
        }
        Goal g=new Goal();
        g.printYear();
    }
    //建立員工類別
    public class Employee{
        private String name="John";
        public int getSalary(){
            return 40000;
        }
        public void job(){
            String name="寫程式";
            System.out.printf("%s 在 %s 的工作內容是 %s\n",this.name,Company.this.name,name);
        }
        
    }
    
}
