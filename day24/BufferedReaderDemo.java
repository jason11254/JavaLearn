/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author MB-study
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\lab\\ocp\\day24\\data.txt");
        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)) {
            String data;
            StringBuilder sb = new StringBuilder();
            while ((data = br.readLine())!=null) {                
                sb.append(data).append("\n");
            }
            System.out.println(sb);
        } catch (Exception e) {
        }
    }
}
