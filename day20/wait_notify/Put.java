/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day20.wait_notify;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MB-study
 */
public class Put implements Runnable{
    private Cookie cookie;

    public Put(Cookie cookie) {
        this.cookie = cookie;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                cookie.put(i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Put.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
