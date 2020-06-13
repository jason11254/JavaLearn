/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author MB-study
 */
public class Insert {
    public static void main(String[] args) throws SQLException {
        Scanner sc=new Scanner(System.in);
        System.out.println("請輸入員工編號(emp_no):");
        String empNo=sc.next();
        System.out.println("請輸入員工姓名(emp_name):");
        String empName=sc.next();
        System.out.println("請輸入員工帳號(emp_username):");
        String empUserName=sc.next();
        System.out.println("請輸入員工密碼(emp_password):");
        String empPassword=sc.next();
        
        String url="jdbc:mysql://localhost:3306/ocp?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
        String user="root";
        String password="12345678";
        Connection conn = DriverManager.getConnection(url, user, password);
        String sql = "insert into employee (emp_no,emp_name,emp_active,emp_username,emp_password) "
                + "values (?,?,true,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, empNo);
        pstmt.setString(2, empName);
        pstmt.setString(3, empUserName);
        pstmt.setString(4, empPassword);
        int rowcount = pstmt.executeUpdate();
        System.out.printf("新增異動筆數: %d\n", rowcount);
    }
}
