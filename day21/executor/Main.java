/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day21.executor;

/**
 *
 * @author MB-study
 */
public class Main {
    public static void main(String[] args) {
        GetTime getTime = new GetTime();
        MyExecutor exec = new MyExecutor();
        exec.execute(getTime);
        exec.execute(getTime);
        exec.execute(getTime);
    }
}
