/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day16;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


/**
 *
 * @author MB-study
 */
public class OpenWeatherDemo {
    private static String key="a82e36203e1d003a2e10a186c5e939a3";
    private static String path="https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s";
    private static String pathicon="http://openweathermap.org/img/wn/%s@2x.png";
    public static void main(String[] args) {
        printWeather("taoyuan,tw");
    }
    public static void printWeather(String city) {
        path=String.format(path, city, key);
        try {
            //1.建立url物件
            URL url = new URL(path);
            //2.取得InputString串流資料
            InputStream is =url.openStream();
            //3.取得json文字資料
            String json = new Scanner(is).useDelimiter("\\A").next();
            System.out.println(json);
            //利用gson分析資料
            JsonObject root = new JsonParser().parse(json).getAsJsonObject();
            JsonObject main = root.getAsJsonObject("main");
            double temp = main.get("temp").getAsDouble()-273.15;
            double feels_like = main.get("feels_like").getAsDouble()-273.15;
            double humidity = main.get("humidity").getAsDouble();
            System.out.printf("溫度: %.1f 體感溫度: %.1f 濕度: %.1f%%\n", temp, feels_like, humidity);
            JsonArray weather = root.getAsJsonArray("weather");            
            JsonObject wObject = weather.get(0).getAsJsonObject();
            String icon = wObject.get("icon").getAsString();
            String description = wObject.get("description").getAsString();
            System.out.println("天氣:"+description);
            String iurl=String.format(pathicon, icon);
            System.out.println(iurl);
            //將icon圖存檔
            InputStream is_icon = new URL(iurl).openStream();
            FileOutputStream fw=new FileOutputStream("src\\main\\java\\com\\lab\\ocp\\day16\\"+icon+".png");
            byte[] bytes = new byte[is_icon.available()];
            is_icon.read(bytes);
            fw.write(bytes);
        } catch (MalformedURLException ex) {
            System.out.println("網路路徑格式錯誤:原因:"+ex);
        } catch (IOException ex) {
            System.out.println("串流資料擷取錯誤:原因:"+ex);
        }
    }
}
