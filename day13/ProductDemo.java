/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day13;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class ProductDemo {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\main\\java\\com\\lab\\ocp\\day13\\product.json");
        String json = new Scanner(file).useDelimiter("\\A").next();
        Type type = new TypeToken<TreeSet<Product>>() {}.getType();
        // 將 products.json 資料匯入
        TreeSet<Product> products = new Gson().fromJson(json, type);     
       
        // 顯示 products 的內容
        System.out.println(products);
        //總共花多少錢
        double sum = products.stream().mapToDouble(p -> p.getAmount() * p.getPrice()).sum();
        System.out.printf("%.2f\n", sum);
    }
}
