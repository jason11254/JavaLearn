/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

/**
 *
 * @author MB-study
 */
public class EmployeeSerialReader {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入員工姓名: ");
        String name = sc.next();
        //讀出序列物件
        File file = new File("src\\main\\java\\com\\lab\\ocp\\day24\\bin\\" + name + ".bin");
        if (file.exists()) {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object object = ois.readObject();
            if (object instanceof Employee) {
                Employee employee = (Employee) object;
                System.out.printf("姓名: %s 薪資: %d \n",employee.getName(),employee.getSalary());
            }else{
                System.out.println("物件錯誤");
            }
        } else {
            System.out.println("查無此人");
        }
    }
}
