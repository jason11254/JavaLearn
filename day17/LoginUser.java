/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MB-study
 */
public class LoginUser {

    public static void main(String[] args) {
        String name = "Jason";
        String ps = "56789";
        boolean check = false;
        try {
            check = login(name, ps);
        } catch (LoginException ex) {
            System.out.println("登入錯誤:"+ex.getMessage());
            ex.howtoDo();
        }
        if (check == true) {
            System.out.println("歡迎 " + name);
        }
    }

    public static boolean login(String name, String ps) throws LoginException {
        String url = "jdbc:mysql://localhost:3306/ocp?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
        String user = "root";
        String password = "12345678";
        String sql = "select * from user where names = ?";
        try (Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String user_pass = new String(new EncrypDES().Decryptor(rs.getBytes("password")));
                if (user_pass.equals(ps)) {
                    return true;
                } else {
                    LoginException le = new LoginException("密碼錯誤");
                    throw le;
                }
            } else {
                LoginException le = new LoginException("查無此人");
                throw le;
            }
        } catch (Exception e) {
            LoginException le = new LoginException(e.getMessage());
            throw le;
        }
    }
}
