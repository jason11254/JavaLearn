/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author MB-study
 */
public class EmployeeSerialWriter {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入員工姓名:");
        String name = sc.next();
        System.out.print("請輸入員工薪資:");
        int salary = sc.nextInt();
        Employee employee = new Employee();
        employee.setName(name);
        employee.setSalary(salary);
        //寫入序列物件
        File file = new File("src\\main\\java\\com\\lab\\ocp\\day24\\bin\\"+name+".bin");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(employee);
        System.out.println("Employee序列化完成");
    }
}
