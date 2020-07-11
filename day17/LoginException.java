/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day17;

/**
 *
 * @author MB-study
 */
public class LoginException extends Exception{

    public LoginException(String string) {
        super(string);
    }
    
    public void howtoDo(){
        System.out.println("請重新登入或嘗試聯絡我們");
    }
    
}
