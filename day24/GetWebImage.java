/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day24;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class GetWebImage {
    public static void main(String[] args) throws Exception {
        // 網路來源
        String path = "https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278_960_720.jpg";
        // 寫入檔案
        File file = new File("src\\main\\java\\com\\lab\\ocp\\day24\\car.jpg");
        // InputStream 讀取串流
        // OutputStream 寫入串流, FileOutputStream 寫入串流到指定檔案
        URLConnection conn = new URL(path).openConnection();
        conn.setRequestProperty("USER-AGENT", "我不是機器人");
        try(InputStream is = conn.getInputStream();
            FileOutputStream fos = new FileOutputStream(file);) {
            int data;
            while ((data = is.read()) != -1) {                
                fos.write(data);
            }
            System.out.println("寫入成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}