/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.MySQL;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.stream.IntStream;

/**
 *
 * @author MB-study
 */
public class Select {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/ocp?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
        String user="root";
        String password="12345678";
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        String sql="select * from employee";
        ResultSet rs = stmt.executeQuery(sql);
        ResultSetMetaData md=rs.getMetaData();
        System.out.printf("%-10s %-15s %-15s \r\n",md.getColumnName(1),md.getColumnName(2),md.getColumnName(3));
        IntStream.rangeClosed(1, 45).forEach(i->System.out.print("-"));
        System.out.println("");
        while(rs.next()){
            String emp_name = rs.getString("emp_name");
            String emp_username = rs.getString("emp_username");
            String emp_password = rs.getString("emp_password");
            System.out.printf("%-10s %-15s %-15s \n",emp_name,emp_username,emp_password);
        }
        rs.close();
        stmt.close();
        conn.close();
        
    }
}
