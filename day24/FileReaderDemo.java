/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day24;

import java.io.FileReader;

/**
 *
 * @author MB-study
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        String path="src\\main\\java\\com\\lab\\ocp\\day24\\data.txt";
        try(FileReader fr = new FileReader(path)) {
            int data;
            while ((data = fr.read())!= -1) {
                System.out.print((char)data);
                
            }
        } catch (Exception e) {
        }
    }
}
