/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day23.forkjoin;

import java.util.concurrent.RecursiveAction;

/**
 *
 * @author MB-study
 */
public class Sum extends RecursiveAction{
    final int A = 3;
    int stIndex, lsIndex;
    int[] data;

    public Sum(int start, int end, int[] data) {
        this.stIndex = start;
        this.lsIndex = end;
        this.data = data;
    }
    
    
    
    @Override
    protected void compute() {
        if(lsIndex - stIndex <=A){
            int sum=0;
            for(int i=stIndex;i<lsIndex;i++)
                sum+=data[i];
            System.out.printf("sum: %d\n",sum);
        }else{
            new Sum(stIndex+A, lsIndex,data).fork();
            new Sum(stIndex, Math.min(lsIndex, stIndex+A),data).compute();
        }
    }
    
}
