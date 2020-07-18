/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day21.executor;

import java.util.concurrent.Executor;

/**
 *
 * @author MB-study
 */
public class MyExecutor implements Executor{

    @Override
    public void execute(Runnable command) {
        new Thread(command).start();
    }
    
}
