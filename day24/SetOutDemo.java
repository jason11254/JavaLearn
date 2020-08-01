/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 * @author MB-study
 */
public class SetOutDemo {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\main\\java\\com\\lab\\ocp\\day24\\log.txt");
        PrintStream out = new PrintStream(file);
        System.out.println("Hello");
        System.setOut(out);
        System.out.println("World");
    }
}
