/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.zip.ZipInputStream;

/**
 *
 * @author MB-study
 */
public class UnZipDemo {
    public static void main(String[] args) {
        File zipFile = new File("src\\main\\java\\com\\lab\\ocp\\day24\\salary.zip");
        try(FileInputStream fis = new FileInputStream(zipFile);
                ZipInputStream zis = new ZipInputStream(fis);
                Reader r = new InputStreamReader(zis)){
            System.out.println(zis.getNextEntry().getName());
            char[] buffer = new char[1];
            StringBuffer sb = new StringBuffer();
            while (r.read(buffer)!=-1) {                
                sb.append(buffer);
            }
            System.out.println(sb);
        }catch(Exception e){
        }
    }
}
