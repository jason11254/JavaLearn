/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day23;

import java.io.File;

/**
 *
 * @author MB-study
 */
public class IteratorFolder {
    public static void main(String[] args) {
        File path = new File("src\\main\\java\\com\\lab\\ocp\\day23");
        File[] files = path.listFiles();
        for(File file:files){
            System.out.printf("%s 是%s\n",file.getName(),file.isDirectory()?"目錄":"檔案");
        }
    }
}
