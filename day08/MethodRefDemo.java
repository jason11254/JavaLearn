/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day08;

/**
 *
 * @author MB-study
 */
class Foo{
    public void play(){
        System.out.println("棒球");
    }
}
class Bar extends Foo{

    @Override
    public void play() {
        System.out.println("籃球");
        super.play();
    }
    
}
public class MethodRefDemo {
    public static void main(String[] args) {
        Bar bar=new Bar();
        bar.play();
    }
}
