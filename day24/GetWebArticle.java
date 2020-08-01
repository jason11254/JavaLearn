/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day24;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author MB-study
 */
public class GetWebArticle {
    public static void main(String[] args) {
        String path = "https://udn.com/news/story/12681/4746513?from=udn_ch2_menu_v2_main_index";

        try(InputStream is = new URL(path).openStream()) {
            byte[] data = new byte[is.available()];
            is.read(data);
            String html = new String(data,"utf-8");
            Document doc = Jsoup.parse(html);
            //System.out.println(doc);
            String title = doc.select("meta[property=\"og:title\"]").attr("content");
            String content = doc.select("meta[property=\"og:description\"]").attr("content");
            File file = new File("src\\main\\java\\com\\lab\\ocp\\day24\\news.txt");
            try(FileWriter fw = new FileWriter(file)) {
                fw.write(title+"\n\n");
                fw.write(content);
                System.out.println("寫入完成");
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
    }
}