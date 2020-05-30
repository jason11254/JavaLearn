/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day08;

import java.util.Random;

/**
 *
 * @author MB-study
 */
public class Zoo {
    public static void main(String[] args) {
        Tiger tiger=new Tiger();
        tiger.move();
        Ostrich ostrich=new Ostrich();
        ostrich.move();
        ostrich.motto();
        //多型
        Animal animal=getAnimal();
        move(animal);
        System.out.println(animal.getClass());
    }
    public static void move(Animal animal) {
        animal.move();
        if(animal instanceof Ostrich)
            ((Ostrich)animal).motto();
        else
            System.out.println("不可轉鴕鳥");
    }
    public static Animal getAnimal(){
        int n=new Random().nextInt(5);
        switch(n){
            case 1:
                return new Tiger();
            case 2:
                return new Fish();
            case 3:
                return new Bird();
            case 4:
                return new Ostrich();
        }
        return new Animal();
    }
    public static void move(Bird bird) {
        bird.move();
    }
}
