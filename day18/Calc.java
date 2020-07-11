/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day18;

/**
 *
 * @author MB-study
 */
public class Calc {

    public int add(int x, int y) {
        int result = x + y;
        return result;
    }

    public int sub(int x, int y) {
        int result = x - y;
        return result;
    }

    public int mul(int x, int y) {
        int result = x * y;
        return result;
    }

    public int div(int x, int y) {
        int result = x / y;
        return result;
    }
    
    public double div2(int x, int y) {
        double result = (double)x / y;
        return result;
    }

    public int max(int x, int y) {
        return x > y ? x:y;
    }
    
    public int min(int x, int y) {
        return x < y ? x:y;
    }
}
