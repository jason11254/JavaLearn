/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day11.mask;

import java.util.Arrays;

/**
 *
 * @author MB-study
 */
public class MaskStore {
    public static void main(String[] args) {
        Mask[] masks={
            new AudltMask(),
            new ChildMask(),
            new AudltMask(),
            new ChildMask(),
            new AudltMask(),
            new AudltMask(),
            new ChildMask(),
            new AudltMask(),
            new ChildMask(),
            new ChildMask(),
            new AudltMask(),
            new ChildMask(),
            new AudltMask(),
            new AudltMask(),
            new AudltMask()
        };
        int total = Arrays.stream(masks)
                .mapToInt(m->m.getPrice())
                .sum();
        System.out.println("總共:"+total+"元");
        //我要買3個成人2個兒童口罩
        AudltMask audltMask = (AudltMask)Arrays.stream(masks).filter(m -> m instanceof AudltMask).findFirst().get();
        ChildMask childMask = (ChildMask)Arrays.stream(masks).filter(m -> m instanceof ChildMask).findFirst().get();

        System.out.println("共:"+(audltMask.getPrice()*3+childMask.getPrice()*2)+"元");
        
    }   
                
}
