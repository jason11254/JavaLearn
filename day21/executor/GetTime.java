/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day21.executor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author MB-study
 */
public class GetTime implements Runnable{

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));
    }
    
}
