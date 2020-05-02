/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day02;

import com.lab.ocp.day02.bar.CellPhone;

/**
 *
 * @author MB-study
 */
public class PhoneMain {
    public static void main(String[] args) {
        CellPhone cp=new CellPhone();
        cp.job();
        cp.price();
    }
}
