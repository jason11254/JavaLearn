/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day23;

/**
 *
 * @author MB-study
 */
import java.io.File;
import java.util.Arrays;

public class RecursiveIteratorFolder {
    public static void main(String[] args) {
        File path = new File("src\\main\\java\\com\\lab\\ocp\\day23");
        list(path);
    }
    
    public static void list(File path) {
        File[] files = path.listFiles();
        for(File file : files) {
            System.out.printf("%s 是%s\n", file.getName(), file.isDirectory()?"目錄":"檔案");
            if(file.isDirectory()) {
                list(file);
            }
        }
    }
      public static void list2(File path) {
        File[] files = path.listFiles();
        Arrays.stream(files).forEach((f) -> {
            if (f.isDirectory()) list2(f);
            System.out.println(f.getName());
        });
    }
}